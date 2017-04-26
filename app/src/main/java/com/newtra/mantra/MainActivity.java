package com.newtra.mantra;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Animation mRotation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getActionBar().hide();
        setContentView(R.layout.activity_splash);
        ImageView iv = (ImageView) findViewById(R.id.imageViewSplash);
        mRotation = AnimationUtils.loadAnimation(this, R.anim.button_rotate);
        iv.startAnimation(mRotation);
        MediaPlayer mediaPlayer= MediaPlayer.create(this, R.raw.bell);
        mediaPlayer.start();
        mRotation.setAnimationListener(new Animation.AnimationListener() {

            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Intent intent = new Intent(getApplicationContext(),
                        ScrollingActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
