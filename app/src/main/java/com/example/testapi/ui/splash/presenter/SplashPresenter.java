package com.example.testapi.ui.splash.presenter;

import com.example.testapi.base.RxPresenter;
import com.example.testapi.data.DataManager;
import com.example.testapi.model.login.Token;
import com.example.testapi.ui.splash.contract.SplashContract;
import com.example.testapi.untils.logger.StringUtils;

import javax.inject.Inject;

public class SplashPresenter  {

    private SplashContract.View splashContract;

    public SplashPresenter(SplashContract.View splashContract) {
        this.splashContract = splashContract;
    }

    public void Show(){
        splashContract.showLogin();
    }

}
