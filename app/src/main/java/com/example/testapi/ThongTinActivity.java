package com.example.testapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class ThongTinActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thong_tin);
        textView = findViewById(R.id.tvText);

        Intent intent = getIntent();
        String data =  intent.getStringExtra("REQUEST");


        try {
            JSONObject jsonObject = new JSONObject(data);
            JSONObject results = jsonObject.getJSONObject("results");
            JSONObject userInfo = results.getJSONObject("userInfo");
            String fullname = userInfo.getString("fullName");
            String address = userInfo.getString("address");
            String userType = userInfo.getString("userType");

            textView.setText(fullname+"\n"+address+"\n"+userType);




        } catch (JSONException e) {
            e.printStackTrace();
        }


    }
}
