package com.example.androidtuts;


import android.app.Application;

import com.example.androidtuts.data.local.DatabaseService;
import com.example.androidtuts.data.remote.NetworkService;
import com.example.androidtuts.di.components.ApplicationComponent;
import com.example.androidtuts.di.components.DaggerApplicationComponent;
import com.example.androidtuts.di.modules.ApplicationModule;

import javax.inject.Inject;

public class MyApplication extends Application {

    public ApplicationComponent applicationComponent;

    @Inject
    public DatabaseService databaseService;

    @Inject
    public NetworkService networkService;

    @Override
    public void onCreate() {
        super.onCreate();

        getDependencies();
    }

    public void getDependencies(){

        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        applicationComponent.inject(this);
    }
}