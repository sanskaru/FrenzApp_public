package com.s090.frenzapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Suraj extends AppCompatActivity {
    MediaPlayer surajM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suraj);
        surajM = MediaPlayer.create(getApplicationContext(),R.raw.suraj);
        Button buttonPlay = (Button) findViewById(R.id.buttonPlay);
        buttonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (surajM.isPlaying()) surajM.pause();
                else surajM.start();
            }
        });
    }
}
