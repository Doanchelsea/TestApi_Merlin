package com.example.testapi;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import androidx.collection.ArrayMap;

import com.example.testapi.api.Server;
import com.example.testapi.model.Login;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainPresenter {

    private Context context;
    private MainView mainView;

    public MainPresenter(Context context, MainView mainView) {
        this.context = context;
        this.mainView = mainView;
    }

    public void postLogin(String phoneNumber, String stateCode, String deviceType) {

        Map<String, Object> jsonParams = new ArrayMap<>();
        jsonParams.put("phoneNumber", phoneNumber);
        jsonParams.put("stateCode", stateCode);
        jsonParams.put("deviceType", deviceType);

        RequestBody body = RequestBody.create(MediaType.parse("application/json;charset=utf-8"),(new JSONObject(jsonParams)).toString());
        Call<ResponseBody> response = Server.getService().postLogin(body);
        response.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if (response.isSuccessful()){
                    if (response.body() != null){
                        try {
                            Intent intent = new Intent(context,ThongTinActivity.class);
                            intent.putExtra("REQUEST",response.body().string());
                            context.startActivity(intent);

                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    }
                }else {
                    Toast.makeText(context, "Không tồn tại", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                mainView.onError("Kiểm tra đường dẫn mạng");
            }
        });
    }
}
