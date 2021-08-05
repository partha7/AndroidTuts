package com.example.androidtuts.data.local;

import android.content.Context;

import com.example.androidtuts.qualifiers.ApplicationContext;
import com.example.androidtuts.qualifiers.DatabaseInfo;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Dummy class to simulate the actual Database using Room or Realm etc
 */
@Singleton
public class DatabaseService {

    private Context context;
    private String databaseName;
    private int version;

    @Inject
    public DatabaseService(@ApplicationContext Context context, @DatabaseInfo String name) {
        // do the initialisation here
        this.context = context;
        databaseName = name;
        version = 1;
    }

    public String getDummyData() {
        return "DATABASE_DUMMY_DATA" +" " + databaseName + " "+ version;
    }
}
