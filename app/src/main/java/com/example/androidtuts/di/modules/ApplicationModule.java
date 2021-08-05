package com.example.androidtuts.di.modules;

import android.content.Context;

import com.example.androidtuts.MyApplication;
import com.example.androidtuts.data.local.DatabaseService;
import com.example.androidtuts.data.remote.NetworkService;
import com.example.androidtuts.qualifiers.ApplicationContext;
import com.example.androidtuts.qualifiers.DatabaseInfo;
import com.example.androidtuts.qualifiers.NetworkInfo;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {
    MyApplication myApplication;

    public ApplicationModule(MyApplication myApplication){
        this.myApplication = myApplication;
    }

    @ApplicationContext
    @Provides
    Context provideContext() {
        return myApplication;
    }

    @Provides
    @DatabaseInfo
    String provideDatabaseName() {
        return "dummy_db";
    }

    @Provides
    @DatabaseInfo
    Integer provideDatabaseVersion() {
        return 1;
    }

    @Provides
    @NetworkInfo
    String provideApiKey() {
        return "SOME_API_KEY";
    }


}
