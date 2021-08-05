package com.example.androidtuts.di.components;

import com.example.androidtuts.di.modules.ActivityModule;
import com.example.androidtuts.di.scope.ActivityScope;
import com.example.androidtuts.ui.MainActivity;

import dagger.Component;

@ActivityScope
@Component(dependencies = {ApplicationComponent.class}, modules = {ActivityModule.class})
public interface ActivityComponent {

    void inject(MainActivity activity);

}
