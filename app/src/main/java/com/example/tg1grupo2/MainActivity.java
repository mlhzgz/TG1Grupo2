package com.example.tg1grupo2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Handler handler = new Handler(Looper.myLooper());

        handler.postDelayed(()->{
            Intent intent = new Intent(MainActivity.this,Recycler.class);
            startActivity(intent);
            finish();
        },2500);
    }
}