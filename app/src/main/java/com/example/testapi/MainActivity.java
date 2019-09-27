package com.example.testapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.testapi.model.Login;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainView {
    private EditText edPhoneNumber;
    private EditText edStateCode;
    private EditText edDeviceType;
    private MainPresenter mainPresenter;
    private List<Login> logins1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();
    }

    private void AnhXa() {
        edPhoneNumber = (EditText) findViewById(R.id.edPhoneNumber);
        edStateCode = (EditText) findViewById(R.id.edStateCode);
        edDeviceType = (EditText) findViewById(R.id.edDeviceType);
        mainPresenter = new MainPresenter(this,this);
        logins1 = new ArrayList<>();
    }

    public void OnClickDangNhap(View view) {
        String phone = edPhoneNumber.getText().toString().trim();
        String code = edStateCode.getText().toString().trim();
        String type = edDeviceType.getText().toString().trim();

        if (phone.equals("")){
            edPhoneNumber.setError(getString(R.string.checktrong));
        }else if (code.equals("")){
            edStateCode.setError(getString(R.string.checktrong));
        }else if (type.equals("")){
            edDeviceType.setError(getString(R.string.checktrong));
        }else {
            mainPresenter.postLogin(phone,code,type);

        }
    }

    @Override
    public void onSuccess(String success) {
        Toast.makeText(this, success, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onError(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onResult(List<Login> logins) {
        logins1 = logins;
    }
}
