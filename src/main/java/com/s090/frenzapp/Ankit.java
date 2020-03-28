package com.s090.frenzapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ankit extends AppCompatActivity {

    MediaPlayer akjM;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ankit);
        akjM = MediaPlayer.create(getApplicationContext(),R.raw.akj);
        Button buttonPlay = (Button) findViewById(R.id.buttonPlay);
        buttonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (akjM.isPlaying())
                {
                    akjM.pause();
                }
                else akjM.start();
            }
        });
    }
}
