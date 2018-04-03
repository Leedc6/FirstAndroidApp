package com.example.a2005.firstandroidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class WelcomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);
    }

    public void onButtonClick1(View v) //Synonym and Antonym (3)
    {
        if (v.getId() == R.id.btnsa)
        {
            Intent i = new Intent(WelcomeScreen.this, Results.class);
            startActivity(i);
        }
    }

    public void onButtonClick2(View x) //Enter Values (2)
    {
        if (x.getId() == R.id.btnev)
        {
            Intent i = new Intent(WelcomeScreen.this, EnterValues.class);
            startActivity(i);
        }
    }
}
