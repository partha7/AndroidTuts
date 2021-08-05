package com.example.androidtuts;


import android.app.Application;

import com.example.androidtuts.data.local.DatabaseService;
import com.example.androidtuts.data.remote.NetworkService;
import com.example.androidtuts.di.DependencyComponent;

public class MyApplication extends Application {

    public DatabaseService databaseService;
    public NetworkService networkService;

    @Override
    public void onCreate() {
        super.onCreate();
        DependencyComponent.inject(this);


    }
}