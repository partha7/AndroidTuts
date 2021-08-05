package com.example.androidtuts;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;

import com.example.androidtuts.data.local.DatabaseService;
import com.example.androidtuts.data.remote.NetworkService;

public class MyApplication extends Application {

    public DatabaseService dbService;
    public NetworkService networkService;
    Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        dbService = new DatabaseService(context);
        networkService = new NetworkService(context);


    }
}