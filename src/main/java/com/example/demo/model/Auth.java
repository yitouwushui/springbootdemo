package com.example.demo.model;

/**
 * Created by ding on 2017/11/27.
 */
public class Auth {

    /**
     * accessToken : 0754cb9020fc5ec458ede744ba37892a
     * tokenType : bearer
     * expiresIn : 86400
     * refreshToken : 1fc979de6113ede3376ff8daeba2f81623cd2474775d974796c16a734b4c157e
     * scope : user_info projects pull_requests issues notes keys hook groups gists
     * createdAt : 1511751417
     */


    private String accessToken;
    private String tokenType;
    private int expiresIn;
    private String refreshToken;
    private String scope;
    private int createdAt;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public int getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(int expiresIn) {
        this.expiresIn = expiresIn;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public int getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(int createdAt) {
        this.createdAt = createdAt;
    }
}
