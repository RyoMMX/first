package com.example.android.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class Library extends AppCompatActivity {
    CommonBehavior commonBehavior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        commonBehavior = new CommonBehavior(this);
        commonBehavior.showHideStatueBar();
        setContentView(R.layout.activity_library);

        commonBehavior.setBehavior();

        Log.e("onCreate", "Library activity");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("onStart", "library activity");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("onResume", "library activity");
    }

    @Override
    public void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
        Log.e("onPause", "library activity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("onStop", "library activity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy", "library activity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("onRestart", "library activity");
    }
}
