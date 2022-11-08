package org.wx.mall.common.exceptions;

/**
 * 登录校验失败异常
 */
public class AuthException extends BizException{
    public AuthException(Integer code, String message) {
        super(code, message);
    }
}
