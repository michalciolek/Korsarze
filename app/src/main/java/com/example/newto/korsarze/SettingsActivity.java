package com.example.newto.korsarze;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }

    public void OnClickBluetooth(View view)
    {

    }

    public void onClickStats(View view)
    {
        Intent intent = new Intent(this,StatsActivity.class);
        startActivity(intent);
    }

    public void onClickDataReset(View view)
    {

    }


    public void OnClickLogin(View view) {

        Intent intent = new Intent(this,LoginActivity.class);
        startActivity(intent);

    }
}
