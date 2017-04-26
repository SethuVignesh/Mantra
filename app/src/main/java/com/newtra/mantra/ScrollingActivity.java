package com.newtra.mantra;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class ScrollingActivity extends AppCompatActivity {
    MediaPlayer mp;
    SoundPool sp;
    int streamID;
    ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        sp = new SoundPool(10, AudioManager.STREAM_MUSIC, 0);
        streamID = sp.load(this, R.raw.bell, 1);
//....
        sp.play(streamID, 1, 1, 1, 0, 1);
        mp = MediaPlayer.create(this, R.raw.bell);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//
                sp.play(streamID, 1, 1, 1, 0, 1);

            }
        });
    }
}
