package com.example.testapi.ui.splash.contract;


import com.example.testapi.base.BaseContract;
import com.example.testapi.data.DataManager;
import com.example.testapi.model.login.Login;

public interface SplashContract  {

    interface View extends BaseContract.BaseView {

        void showLogin();
    }

    interface Presenter<T> extends BaseContract.BasePresenter<T> {

    }
}
