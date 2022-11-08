package org.wx.mall.common.annotations.impl;

import com.auth0.jwt.exceptions.JWTVerificationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.wx.mall.common.annotations.LoginParamRequire;
import org.wx.mall.common.constants.ErrorCodeEnum;
import org.wx.mall.common.exceptions.AuthException;
import org.wx.mall.common.utils.JwtUtil;

@Component
public class LoginParamReslover implements HandlerMethodArgumentResolver {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    public static final String LOGIN_TOKEN_KEY = "Wxshop-Token";

    @Autowired
    private JwtUtil jwtUtil;

    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        return Long.class.isAssignableFrom(methodParameter.getParameterType()) && methodParameter.hasParameterAnnotation(LoginParamRequire.class);
    }

    @Override
    public Object resolveArgument(MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer, NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory) throws Exception {
        String token = nativeWebRequest.getHeader(LOGIN_TOKEN_KEY);
        if (token == null || token.isEmpty()) {
            throw new AuthException(ErrorCodeEnum.UNLOGIN.getErrCode(), ErrorCodeEnum.UNLOGIN.getErrMsg());
        }

        try {
            return jwtUtil.verifyTokenAndGetUserId(token);
        } catch (JWTVerificationException e) {
            logger.error("token解码失败" + e.getMessage(), e);
            throw new AuthException(ErrorCodeEnum.UNLOGIN.getErrCode(), ErrorCodeEnum.UNLOGIN.getErrMsg());
        }

    }
}
