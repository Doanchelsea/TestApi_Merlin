package com.example.testapi.ui.login.presenter;

import android.widget.Toast;

import com.example.testapi.R;
import com.example.testapi.api.Constants;
import com.example.testapi.api.Server;
import com.example.testapi.data.DataManager;
import com.example.testapi.ui.login.contract.MainView;
import com.example.testapi.untils.constants.AppContants;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.RequestBody;


public class MainPresenter {

    private MainView.View mainView;

    public MainPresenter(MainView.View mainView) {
        this.mainView = mainView;
    }

    public void postLogin(String phoneNumber) {

        Map<String, String> jsonParams = new HashMap<>();
        jsonParams.put(AppContants.KEY_LOGIN_PHONE_NUMBER, phoneNumber);
        jsonParams.put(AppContants.KEY_LOGIN_STATE_CODE, AppContants.VALUE_LOGIN_VIETNAMESE_STATE_CODE);
        jsonParams.put(AppContants.KEY_LOGIN_DEVICE_TYPE, AppContants.VALUE_LOGIN_ANDROID_DEVICE_TYPE);

        RequestBody body = RequestBody.create(okhttp3.MediaType.parse(Constants.APPLICATION),
                (new JSONObject(jsonParams)).toString());

        CompositeDisposable compositeDisposable = new CompositeDisposable();
        compositeDisposable.add(Server.getService().postLogin(body)
                .flatMap(logins -> Observable.just(logins.getResults()) )
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
            .subscribe((results) -> {
                      mainView.onResult(results);
                   },
                    (error) -> {
                    mainView.showError(R.string.common_noti_error_message);
                    }));
}

}
