package com.example.androidtuts.ui;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidtuts.R;


public class MainActivity extends AppCompatActivity {

    public com.example.androidtuts.ui.MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialize MainViewModel
        viewModel = new MainViewModel(this.getApplicationContext());

        TextView tvData = findViewById(R.id.tvData);
        tvData.setText(viewModel.getSomeData());
    }
}
