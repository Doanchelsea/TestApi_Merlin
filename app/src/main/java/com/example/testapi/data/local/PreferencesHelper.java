package com.example.testapi.data.local;


import com.example.testapi.model.login.Token;
import com.example.testapi.model.login.UserInfo;

/**
 * doannd ==> ok
 *
 * interface shared references
 */
public interface PreferencesHelper {

    void setDeviceId(String deviceId);

    String getDeviceId();

    void setLoggedIn(boolean isLoggedIn);

    boolean IsLoggedIn();

    void setUserInfo(UserInfo userInfo);

    UserInfo getUserInfo();

    void setToken(Token token);

    Token getToken();

    void clearDeviceId();

    void clearUserInfo();

    void clearToken();

}
