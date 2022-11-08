package org.wx.mall.api.controller;


import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.bean.WxMaJscode2SessionResult;
import cn.binarywang.wx.miniapp.bean.WxMaPhoneNumberInfo;
import me.chanjar.weixin.common.error.WxErrorException;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;
import org.wx.mall.api.dto.UserLoginResultDto;
import org.wx.mall.api.dto.UserUpdateMobileResultDto;
import org.wx.mall.api.vo.UserLoginParamVO;
import org.wx.mall.api.vo.UserUpdateMobileParamVO;
import org.wx.mall.api.vo.UserUpdateProfileParamVO;
import org.wx.mall.common.annotations.LoginParamRequire;
import org.wx.mall.common.constants.ErrorCodeEnum;
import org.wx.mall.common.exceptions.BizException;
import org.wx.mall.common.utils.JwtUtil;
import org.wx.mall.common.utils.ResponseUtil;

import org.wx.mall.core.service.UserService;
import org.wx.mall.core.entity.WxshopUser;
import javax.annotation.Resource;

@RestController
@RequestMapping("/api/user")
public class ApiUserController {

    @Resource
    private WxMaService wxmaService;

    @Resource
    private UserService userService;

    @Resource
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public Object login(@RequestBody UserLoginParamVO userLoginParamVO) {
        String code = userLoginParamVO.getCode();
        WxMaJscode2SessionResult result;
        try {
            result = wxmaService.getUserService().getSessionInfo(code);
        } catch (WxErrorException e) {
            throw new BizException(ErrorCodeEnum.FAILED.getErrCode(), "登录失败，请重试");
        }

        String openid = result.getOpenid();
        String unionid = result.getUnionid();
        String sessionKey = result.getSessionKey();

        WxshopUser user = userService.findByOpenid(openid);
        if (user == null) {
            user = new WxshopUser();
            user.setOpenid(openid);
            user.setUnionid(unionid);
            user.setSessionKey(sessionKey);
            userService.insert(user);
        } else {
            // 更新sessionKey
            user.setSessionKey(sessionKey);
            user.setUnionid(unionid);
            userService.updateById(user.getId(), user);
        }

        String token = jwtUtil.createToken(user.getId(), 2);
        UserLoginResultDto respVo = new UserLoginResultDto();
        respVo.setToken(token);
        BeanUtils.copyProperties(user, respVo);
        return ResponseUtil.ok(respVo);
    }

    @PutMapping("/updateProfile")
    public Object updateProfile(@LoginParamRequire Long userId, @RequestBody UserUpdateProfileParamVO userUpdateProfileParamVO) {
        WxshopUser user = new WxshopUser();
        user.setAvatar(userUpdateProfileParamVO.getAvatar());
        user.setCity(userUpdateProfileParamVO.getCity() == null ? "" : userUpdateProfileParamVO.getCity());
        user.setCountry(userUpdateProfileParamVO.getCountry() == null ? "" : userUpdateProfileParamVO.getCountry());
        user.setProvince(userUpdateProfileParamVO.getProvince() == null ? "" : userUpdateProfileParamVO.getProvince());
        user.setGender(userUpdateProfileParamVO.getGender() == null ? 0 : userUpdateProfileParamVO.getGender());

        userService.updateById(userId, user);
        return ResponseUtil.ok();
    }

    @PutMapping("/updateMobile")
    public Object updateMobile(@LoginParamRequire Long userId, @RequestBody UserUpdateMobileParamVO userUpdateMobileParamVO) {
        WxshopUser user = userService.findById(userId);
        if (user == null) {
            throw new BizException(ErrorCodeEnum.FAILED.getErrCode(), "用户不存在");
        }

        WxMaPhoneNumberInfo phoneInfo = wxmaService.getUserService().getPhoneNoInfo(
                user.getSessionKey(),
                userUpdateMobileParamVO.getEncryptedData(),
                userUpdateMobileParamVO.getIv());

        user.setMobile(phoneInfo.getPhoneNumber());
        userService.updateById(userId, user);

        UserUpdateMobileResultDto respInfo = new UserUpdateMobileResultDto();
        respInfo.setMobile(phoneInfo.getPhoneNumber());
        return ResponseUtil.ok(respInfo);
    }
}
