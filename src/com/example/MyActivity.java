package com.example;

import android.app.Activity;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;

public class MyActivity extends Activity
{
    MediaPlayer mp;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        mp = null;
        setContentView(R.layout.main);
    }

    @Override
    public void onResume() {
        super.onResume();
        if(mp == null)
        {
            mp = MediaPlayer.create(this, R.raw.kerolarap);
            mp.start();
        }
        else
            mp.start();
    }

    @Override
    public void onPause()
    {
        super.onPause();
        System.out.println("onPAUSE");
        if (mp != null){
            System.out.println("NOT NULL - STOPPING");
            mp.pause();
        }
    }

}
