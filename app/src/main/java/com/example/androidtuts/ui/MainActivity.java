package com.example.androidtuts.ui;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidtuts.MyApplication;
import com.example.androidtuts.R;
import com.example.androidtuts.di.DependencyComponent;


public class MainActivity extends AppCompatActivity {

    public com.example.androidtuts.ui.MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialize MainViewModel

        DependencyComponent.inject(this);

        TextView tvData = findViewById(R.id.tvData);
        tvData.setText(viewModel.getSomeData());
    }
}
