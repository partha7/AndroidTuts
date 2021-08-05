package com.example.androidtuts.ui;

import android.content.Context;

import com.example.androidtuts.data.local.DatabaseService;
import com.example.androidtuts.data.remote.NetworkService;

public class MainViewModel {

    private DatabaseService databaseService;
    private NetworkService networkService;

    public MainViewModel(Context context) {
        networkService = new NetworkService(context);
        databaseService = new DatabaseService(context);
    }

    public String getSomeData() {
        return databaseService.getDummyData() + " : " + networkService.getDummyData();
    }
}
