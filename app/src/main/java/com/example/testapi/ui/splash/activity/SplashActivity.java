package com.example.testapi.ui.splash.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.testapi.R;
import com.example.testapi.base.BaseActivity;
import com.example.testapi.data.DataManager;
import com.example.testapi.model.login.Login;
import com.example.testapi.ui.login.activity.MainActivity;
import com.example.testapi.ui.splash.contract.SplashContract;
import com.example.testapi.ui.splash.presenter.SplashPresenter;
import com.example.testapi.widget.LoadingDialog;
import com.novoda.merlin.Bindable;
import com.novoda.merlin.Connectable;
import com.novoda.merlin.Disconnectable;
import com.novoda.merlin.Merlin;
import com.novoda.merlin.NetworkStatus;

import java.util.concurrent.TimeUnit;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class SplashActivity extends BaseActivity implements SplashContract.View, Connectable, Disconnectable, Bindable {

    @Inject
    SplashPresenter splashPresenter;
    @Override


    protected int getLayoutId() {
        return R.layout.activity_splash;
    }

    @Override
    protected void onResume() {
        super.onResume();
        registerConnectable(this);
        registerDisconnectable(this);
        registerBindable(this);
    }

    @Override
    protected void addEvents() {
        splashPresenter = new SplashPresenter(this);
    }


    @Override
    protected Merlin initMerlin() {
         return new Merlin.Builder()
                .withConnectableCallbacks()
                .withDisconnectableCallbacks()
                .withBindableCallbacks()
                .build(this);
    }




    // check mang
    @Override
    public void onBind(NetworkStatus networkStatus) {
        if (!networkStatus.isAvailable()) {
            onDisconnect();
        }
    }

    @Override
    public void onConnect() {
        showProgress(true);
        splashPresenter.Show();

    }

    @Override
    public void onDisconnect() {
        showProgress(false);
        showToastDisconnect();
    }


    @Override
    public void showLogin() {
        addDisposable(Observable.just(0).delay(1000, TimeUnit.MILLISECONDS)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(aVoid -> {
                    openLoginScreen();
                }));
    }


    @Override
    public void showProgress(boolean show) {
        if (show) {
            LoadingDialog.getInstance().showLoading(this);
        } else {
            LoadingDialog.getInstance().hideLoading();
        }
    }

    @Override
    public void showError(int stringResId) {
    }


    private void openLoginScreen() {
        showProgress(false);
        MainActivity.startActivity(this);
        finish();
    }
}
