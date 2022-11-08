package org.wx.mall.api.config;

import cn.binarywang.wx.miniapp.config.impl.WxMaDefaultConfigImpl;
import org.springframework.stereotype.Component;
import org.wx.mall.common.utils.LocalDateTimeUtil;
import org.wx.mall.core.entity.WxshopAccessToken;
import org.wx.mall.core.service.AccessTokenService;

import javax.annotation.Resource;
import java.time.LocalDateTime;

@Component
public class WxMaMysqlConfigImpl extends WxMaDefaultConfigImpl {
    private static final String ACCESS_TOKEN_KEY_TPL = "%s:access_token";
    private volatile String accessTokenKey;

    @Resource
    private AccessTokenService accessTokenService;

    @Override
    public void setAppid(String appId) {
        super.setAppid(appId);
        this.accessTokenKey = String.format(ACCESS_TOKEN_KEY_TPL, appId);
    }

    @Override
    public String getAccessToken() {
        WxshopAccessToken accessToken = accessTokenService.findOneByKey(this.accessTokenKey);
        if (accessToken != null) {
            return accessToken.getValue();
        }
        return null;
    }

    @Override
    public boolean isAccessTokenExpired() {
        WxshopAccessToken accessToken = accessTokenService.findOneByKey(this.accessTokenKey);
        return accessToken == null || System.currentTimeMillis() > accessToken.getExpireAt();
    }

    @Override
    public synchronized void updateAccessToken(String accessToken, int expiresInSeconds) {
        long expireAt = System.currentTimeMillis() + (expiresInSeconds - 200) * 1000L;
        LocalDateTime expireAtTime = LocalDateTimeUtil.epochMilliToDateTime(expireAt);

        WxshopAccessToken wxshopAccessToken = new WxshopAccessToken();
        wxshopAccessToken.setKey(this.accessTokenKey);
        wxshopAccessToken.setValue(accessToken);
        wxshopAccessToken.setExpireAt(expireAt);
        wxshopAccessToken.setExpireAtTime(expireAtTime);
        accessTokenService.upsertSelective(wxshopAccessToken);
    }

    @Override
    public void expireAccessToken() {
        accessTokenService.deleteBykey(this.accessTokenKey);
    }

}
