package com.example.testapi;

import com.example.testapi.model.Login;

import java.util.List;

public interface MainView {
    void onSuccess(String success);
    void onError(String error);
    void onResult(List<Login> logins);
}
