package com.example.androidtuts.di;

import android.app.Application;
import android.content.Context;

import com.example.androidtuts.MyApplication;
import com.example.androidtuts.data.local.DatabaseService;
import com.example.androidtuts.data.remote.NetworkService;
import com.example.androidtuts.ui.MainActivity;
import com.example.androidtuts.ui.MainViewModel;

public class DependencyComponent {

    public static void inject(MyApplication application){
        application.databaseService = new DatabaseService(application);
        application.networkService = new NetworkService(application);
    }

    public static  void inject(MainActivity mainActivity){
        MyApplication application = (MyApplication) mainActivity.getApplication();
        mainActivity.viewModel = new MainViewModel(application.databaseService, application.networkService);
    }

}
