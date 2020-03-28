package com.s090.frenzapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tanweer extends AppCompatActivity {

    MediaPlayer razaM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanweer);
        razaM = MediaPlayer.create(getApplicationContext(),R.raw.raza);
        Button buttonPlay = (Button) findViewById(R.id.buttonPlay);
        buttonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (razaM.isPlaying()) razaM.pause();
                else razaM.start();
            }
        });
    }

}
