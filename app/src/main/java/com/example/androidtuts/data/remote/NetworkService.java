package com.example.androidtuts.data.remote;

import android.content.Context;

import com.example.androidtuts.qualifiers.ApplicationContext;
import com.example.androidtuts.qualifiers.NetworkInfo;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Dummy class to simulate the actual NetworkService using Retrofit or OkHttp etc
 */

@Singleton
public class NetworkService {

    private Context context;
    private String apiKey;
    private String name;

    @Inject
    public NetworkService(@ApplicationContext Context context, @NetworkInfo String name) {
        this.context = context;
        // do the initialisation here
        this.name = name;
        apiKey = "SOME_API_KEY";
    }

    public String getDummyData() {
        return "NETWORK_DUMMY_DATA"+" " + name + " "+"naya";
    }
}
