package com.s090.frenzapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;

public class MainActivity extends AppCompatActivity
{
    NumberPicker niggas;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        niggas = (NumberPicker) findViewById(R.id.niggas);
        String[] names = {"Suraj Singh", "Shashi Shaw", "Ankit Kr. Jha", "Tanweer Raza"};
        niggas.setDisplayedValues(names);
        niggas.setMinValue(0);
        niggas.setMaxValue(names.length - 1);
    }
    public void selector(View v)
    {
        int myChoice = niggas.getValue();
        if (myChoice==0)
        {
            Intent suraj = new Intent();
            suraj.setClass(getApplicationContext(),Suraj.class);
            startActivity(suraj);
        }
        else if (myChoice==1)
        {
            Intent shashi = new Intent();
            shashi.setClass(getApplicationContext(),Shashi.class);
            startActivity(shashi);
        }
        else if (myChoice==2)
        {
            Intent akj = new Intent();
            akj.setClass(getApplicationContext(),Ankit.class);
            startActivity(akj);
        }
        else if (myChoice==3)
        {
            Intent raza = new Intent();
            raza.setClass(getApplicationContext(),Tanweer.class);
            startActivity(raza);
        }
    }
    public void aboutUs(View v)
    {
        Intent about = new Intent();
        about.setClass(getApplicationContext(),about.class);
        startActivity(about);
    }
}