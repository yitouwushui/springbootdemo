package com.example.demo.http;

/**
 * 静态资源
 * @author yitouwushui
 */
public interface Constants {
    /**Client ID*/
    public static final String CLIENT_ID = "e3eff8aa8c3b11a4b44ffd729b78687ad3bfa6b02c0d791cdde1597d6eae5296";
    /**Client Secret*/
    public static final String CLIENT_SECRET = "311f9b81b8b449e52d66746afeca3a3333be15dae5dfb47c2db672bee3044a59";
    /**Redirect Uri*/
    public static final String REDIRECT_URI = "http://localhost:8080/gitee/redirect";
    /**Grant Type*/
    public static final String GRANT_TYPE = "authorization_code";
    /**获取code*/
    public static final String GET_CLIENT_CODE = "https://gitee.com/oauth/authorize?";
    /**获取ACCESS_TOKEN*/
    public static final String POST_ACCESS_TOKEN = "https://gitee.com/oauth/token?";
}
