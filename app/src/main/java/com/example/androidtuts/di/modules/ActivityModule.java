package com.example.androidtuts.di.modules;

import com.example.androidtuts.data.local.DatabaseService;
import com.example.androidtuts.data.remote.NetworkService;
import com.example.androidtuts.di.scope.ActivityScope;
import com.example.androidtuts.ui.MainActivity;
import com.example.androidtuts.ui.MainViewModel;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {
    MainActivity activity;
    public ActivityModule(MainActivity activity){
        this.activity = activity;
    }

    @ActivityScope
    @Provides
    MainViewModel getMainViewModel(DatabaseService databaseService, NetworkService networkService){

        return new MainViewModel(databaseService, networkService);
    }

}
