package com.example.testapi.ui.login.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.testapi.R;
import com.example.testapi.base.BaseActivity;
import com.example.testapi.model.login.Login;
import com.example.testapi.model.login.Results;
import com.example.testapi.ui.login.presenter.MainPresenter;
import com.example.testapi.ui.login.contract.MainView;
import com.example.testapi.untils.constants.AppContants;
import com.example.testapi.widget.LoadingDialog;
import com.jakewharton.rxbinding3.view.RxView;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.novoda.merlin.Bindable;
import com.novoda.merlin.Connectable;
import com.novoda.merlin.Disconnectable;
import com.novoda.merlin.Merlin;
import com.novoda.merlin.NetworkStatus;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.Observable;

public class MainActivity extends BaseActivity implements MainView.View, Connectable, Disconnectable, Bindable {

      @BindView(R.id.edPhoneNumber)
      EditText edPhoneNumber;
      @BindView(R.id.btnDangNhap)
      Button btnDangNhap;


      MainPresenter mainPresenter;


    @Override
    protected void onResume() {
        super.onResume();
        registerConnectable(this);
        registerDisconnectable(this);
        registerBindable(this);
    }

      public static void startActivity(Activity context) {
          context.startActivity(new Intent(context, MainActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
          context.finish();
      }


      @Override
      protected int getLayoutId() {
          return R.layout.activity_main;
      }


    @Override
      protected void addEvents() {
        mainPresenter = new MainPresenter(this);
          addDisposable(RxView.clicks(btnDangNhap)
                  .subscribe(aVoid -> {
                      showProgress(true);
                      String number = edPhoneNumber.getText().toString().trim();
                      mainPresenter.postLogin(number);
                  }));
      }

    @Override
    protected Merlin initMerlin() {
        return new Merlin.Builder()
                .withConnectableCallbacks()
                .withDisconnectableCallbacks()
                .withBindableCallbacks()
                .build(this);
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
        showProgress(false);
        Toast.makeText(context, ""+stringResId, Toast.LENGTH_SHORT).show();
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

    }

    @Override
    public void onDisconnect() {
        showProgress(false);
        showToastDisconnect();
    }

    @Override
    public void onResult(Results results) {
        showProgress(false);
        Toast.makeText(context, results.getUserInfo().getAddress(), Toast.LENGTH_SHORT).show();
    }
}
