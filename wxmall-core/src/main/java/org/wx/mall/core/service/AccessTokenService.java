package org.wx.mall.core.service;

import org.springframework.stereotype.Service;
import org.wx.mall.core.entity.WxshopAccessToken;
import org.wx.mall.core.entity.WxshopAccessTokenExample;
import org.wx.mall.core.mapper.WxshopAccessTokenMapper;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AccessTokenService {
    @Resource
    private WxshopAccessTokenMapper accessTokenMapper;

    public WxshopAccessToken findOneByKey(String key) {
        WxshopAccessTokenExample example = new WxshopAccessTokenExample();
        example.or().andKeyEqualTo(key);
        List<WxshopAccessToken>  wxshopAccessTokens=accessTokenMapper.selectByExample(example);
        if(wxshopAccessTokens.isEmpty()){
            return null;
        }
        return wxshopAccessTokens.get(0);
    }

    public int upsertSelective(WxshopAccessToken accessToken) {
        return accessTokenMapper.updateByPrimaryKeySelective(accessToken);
    }

    public int deleteBykey(String key) {
        WxshopAccessTokenExample example = new WxshopAccessTokenExample();
        example.or().andKeyEqualTo(key);
        return accessTokenMapper.deleteByExample(example);
    }
}
