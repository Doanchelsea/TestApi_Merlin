package com.example.testapi.api;


import com.example.testapi.model.login.Login;

import io.reactivex.Observable;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface Service {

    @POST("user/checkuserexist")
    Observable<Login> postLogin(@Body RequestBody body);
}
