package com.example.anton.antonsgpsacc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.os.Vibrator;

public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
    }

    public void openCompass(View view) {
        Vibrator v = (Vibrator)getSystemService(this.VIBRATOR_SERVICE);
        // Vibrate for 500 milliseconds
        v.vibrate(250);
        Intent intent = new Intent(this, Compass.class);
        startActivity(intent);

    }
    public void openACCMeter(View view) {
        Vibrator v = (Vibrator)getSystemService(this.VIBRATOR_SERVICE);
        // Vibrate for 500 milliseconds
        v.vibrate(250);
        Intent intent = new Intent(this, AcceMeter.class);
        startActivity(intent);

    }
}
