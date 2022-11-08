package org.wx.mall.core.service;


import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.wx.mall.core.entity.WxshopUser;
import org.wx.mall.core.entity.WxshopUserExample;
import org.wx.mall.core.mapper.WxshopUserMapper;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class UserService {

    @Resource
    private WxshopUserMapper userMapper;

    public void insert(WxshopUser user) {
        user.setAddTime(LocalDateTime.now());
        user.setUpdateTime(LocalDateTime.now());
        userMapper.insertSelective(user);
    }

    public WxshopUser findById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    public WxshopUser findByOpenid(String openid) {
        WxshopUserExample example = new WxshopUserExample();
        example.or().andOpenidEqualTo(openid);
        List<WxshopUser> wxshopUsers=userMapper.selectByExample(example);
        if(wxshopUsers.isEmpty()){
            return null;
        }
        return wxshopUsers.get(0);
    }

    public List<WxshopUser> list(String openid, String unionid, String nickname,
                                   String mobile, Integer page, Integer pageSize) {
        WxshopUserExample example = new WxshopUserExample();
        WxshopUserExample.Criteria criteria = example.or();

        if (!StringUtils.isEmpty(nickname)) {
            criteria.andNicknameLike("%" + nickname + "%");
        }
        if (!StringUtils.isEmpty(mobile)) {
            criteria.andMobileEqualTo(mobile);
        }
        if (!StringUtils.isEmpty(openid)) {
            criteria.andOpenidEqualTo(openid);
        }
        if (!StringUtils.isEmpty(unionid)) {
            criteria.andOpenidEqualTo(unionid);
        }
        example.setOrderByClause("id desc");

        PageHelper.startPage(page, pageSize);
        return userMapper.selectByExample(example);
    }

    public int updateById(Long id, WxshopUser user) {
        user.setId(id);
        user.setUpdateTime(LocalDateTime.now());
        return userMapper.updateByPrimaryKey(user);

    }


}
