package com.example.testapi.ui.login.contract;



import com.example.testapi.base.BaseContract;
import com.example.testapi.model.login.Login;
import com.example.testapi.model.login.Results;

public interface MainView {

    interface View extends BaseContract.BaseView {
        void onResult(Results results);
    }

    interface Presenter<T> extends BaseContract.BasePresenter<T> {

    }
}
