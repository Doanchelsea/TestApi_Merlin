package com.example.testapi.api;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class Server {
    public static Service service;

    public static Service getService(){
        if (service == null){

            OkHttpClient.Builder clientBuilder = new OkHttpClient.Builder()
                    .connectTimeout(60, TimeUnit.SECONDS)//quy dinh thoi gian client conect den server,qua thoi gian la huy
                    .readTimeout(10, TimeUnit.SECONDS);//thoi gian cho du lieu ve

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(Constants.BASE_RETROFIT_API_URL).client(clientBuilder.build())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            service = retrofit.create(Service.class);
        }
        return service;
    }
}
