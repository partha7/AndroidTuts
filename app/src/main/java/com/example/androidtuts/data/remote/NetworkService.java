package com.example.androidtuts.data.remote;

import android.content.Context;

/**
 * Dummy class to simulate the actual NetworkService using Retrofit or OkHttp etc
 */
public class NetworkService {

    private Context context;
    private String apiKey;
    private String name;

    public NetworkService(Context context, String name) {
        this.context = context;
        // do the initialisation here
        this.name = name;
        apiKey = "SOME_API_KEY";
    }

    public String getDummyData() {
        return "NETWORK_DUMMY_DATA"+" " + name;
    }
}
