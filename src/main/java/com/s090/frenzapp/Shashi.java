package com.s090.frenzapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Shashi extends AppCompatActivity {
    MediaPlayer shashiM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shashi);
        shashiM = MediaPlayer.create(getApplicationContext(),R.raw.shashi);
        Button buttonPlay = (Button) findViewById(R.id.buttonPlay);
        buttonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (shashiM.isPlaying()) shashiM.pause();
                else shashiM.start();
            }
        });
    }
}
