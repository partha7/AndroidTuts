package com.example.androidtuts.di.modules;

import com.example.androidtuts.MyApplication;
import com.example.androidtuts.data.local.DatabaseService;
import com.example.androidtuts.data.remote.NetworkService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {
    MyApplication myApplication;

    public ApplicationModule(MyApplication myApplication){
        this.myApplication = myApplication;
    }

    @Singleton
    @Provides
    DatabaseService providesDatabaseService(){
        return new DatabaseService(myApplication, "abc");
    }

    @Singleton
    @Provides
    NetworkService providesNetworkService(){
        return new NetworkService(myApplication, "cde");
    }

}
