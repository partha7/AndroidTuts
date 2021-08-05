package com.example.androidtuts.ui;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidtuts.MyApplication;
import com.example.androidtuts.R;
import com.example.androidtuts.di.components.ActivityComponent;
import com.example.androidtuts.di.components.DaggerActivityComponent;
import com.example.androidtuts.di.modules.ActivityModule;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {

    @Inject
    public MainViewModel viewModel;
    ActivityComponent activityComponent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialize MainViewModel
        getDependencies();

        TextView tvData = findViewById(R.id.tvData);
        tvData.setText(viewModel.getSomeData());
    }
    public void getDependencies(){
        activityComponent = DaggerActivityComponent
                .builder()
                .applicationComponent(((MyApplication) getApplication()).applicationComponent)
                .activityModule(new ActivityModule(this))
                .build();
        activityComponent.inject(this);
    }
}
