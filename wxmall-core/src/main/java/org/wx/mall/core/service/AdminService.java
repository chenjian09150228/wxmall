package org.wx.mall.core.service;

import org.springframework.stereotype.Service;
import org.wx.mall.core.entity.WxshopAdmin;
import org.wx.mall.core.entity.WxshopAdminExample;
import org.wx.mall.core.mapper.WxshopAdminMapper;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdminService {

    @Resource
    private WxshopAdminMapper wxshopAdminMapper;

    public WxshopAdmin findByUsernameAndPwd(String username, String pwd) {
        WxshopAdminExample example = new WxshopAdminExample();
        example.or()
                .andUsernameEqualTo(username)
                .andPasswordEqualTo(pwd)
                .andDeletedEqualTo(false);
        List<WxshopAdmin> wxshopAdminList=wxshopAdminMapper.selectByExample(example);
        if(wxshopAdminList.isEmpty()){
            return null;
        }
        return wxshopAdminList.get(0);
    }
}
