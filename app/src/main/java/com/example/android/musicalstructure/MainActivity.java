package com.example.android.musicalstructure;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    CommonBehavior commonBehavior;
    ArrayList<Audio> audios = new ArrayList<>();
//    MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        commonBehavior = new CommonBehavior(this);
        commonBehavior.showHideStatueBar();

        setContentView(R.layout.activity_main);
        commonBehavior.setBehavior();

        Log.e("onCreate", "main activity");

        setData();

        ListView listView = (ListView) findViewById(R.id.audio_list_view);
        AudioListAdapter adapter = new AudioListAdapter(this, audios);
        listView.setAdapter(adapter);
    }

    private void setData() {
        audios.add(new Audio("muhammad", R.drawable.ic_android_black_24dp, "ahmad", "hello"));
        audios.add(new Audio("muhammad", R.drawable.ic_android_black_24dp, "ahmad", "hello"));
        audios.add(new Audio("muhammad", R.drawable.ic_android_black_24dp, "ahmad", "hello"));
        audios.add(new Audio("muhammad", R.drawable.ic_android_black_24dp, "ahmad", "hello"));
        audios.add(new Audio("muhammad", R.drawable.ic_android_black_24dp, "ahmad", "hello"));
        audios.add(new Audio("muhammad", R.drawable.ic_android_black_24dp, "ahmad", "hello"));
        audios.add(new Audio("muhammad", R.drawable.ic_android_black_24dp, "ahmad", "hello"));
        audios.add(new Audio("muhammad", R.drawable.ic_android_black_24dp, "ahmad", "hello"));
        audios.add(new Audio("muhammad", R.drawable.ic_android_black_24dp, "ahmad", "hello"));
        audios.add(new Audio("muhammad", R.drawable.ic_android_black_24dp, "ahmad", "hello"));
        audios.add(new Audio("muhammad", R.drawable.ic_android_black_24dp, "ahmad", "hello"));
        audios.add(new Audio("muhammad", R.drawable.ic_android_black_24dp, "ahmad", "hello"));
        audios.add(new Audio("muhammad", R.drawable.ic_android_black_24dp, "ahmad", "hello"));
        audios.add(new Audio("muhammad", R.drawable.ic_android_black_24dp, "ahmad", "hello"));
        audios.add(new Audio("muhammad", R.drawable.ic_android_black_24dp, "ahmad", "hello"));
        audios.add(new Audio("muhammad", R.drawable.ic_android_black_24dp, "ahmad", "hello"));
        audios.add(new Audio("muhammad", R.drawable.ic_android_black_24dp, "ahmad", "hello"));
        audios.add(new Audio("muhammad", R.drawable.ic_android_black_24dp, "ahmad", "hello"));
        audios.add(new Audio("muhammad", R.drawable.ic_android_black_24dp, "ahmad", "hello"));
        audios.add(new Audio("muhammad", R.drawable.ic_android_black_24dp, "ahmad", "hello"));
        audios.add(new Audio("muhammad", R.drawable.ic_android_black_24dp, "ahmad", "hello"));

//        mediaPlayer = MediaPlayer.create(this, R.raw.audio);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("onStart", "main activity");

/*        mediaPlayer.start();
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        mediaPlayer.seekTo(preferences.getInt("CurrentPosition", 0));*/


    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("onResume", "main activity");
    }

    @Override
    public void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
        Log.e("onPause", "main activity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("onStop", "main activity");
//        mediaPlayer.pause();

//        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
//        SharedPreferences.Editor editor = preferences.edit();
//        editor.putInt("CurrentPosition", mediaPlayer.getCurrentPosition());
//        editor.apply();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy", "mian activity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("onRestart", "main activity");
    }


    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("Are you sure you want to exit?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        MainActivity.super.onBackPressed();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }
}
