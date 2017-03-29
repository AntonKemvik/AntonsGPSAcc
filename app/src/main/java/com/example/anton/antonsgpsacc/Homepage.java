package com.example.anton.antonsgpsacc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
    }

    public void openCompass(View view) {
        Intent intent = new Intent(this, Compass.class);
        startActivity(intent);

    }
    public void openACCMeter(View view) {
        Intent intent = new Intent(this, AcceMeter.class);
        startActivity(intent);

    }
}
