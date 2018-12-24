package com.example.android.musicstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NowplayingActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_nowplaying);

    }

    public void home(View view){

        Intent homeIntent = new Intent(this,MainActivity.class);

        startActivity(homeIntent);

    }


    public void artistsCategory(View view){

        Intent artistsIntent = new Intent(this,ArtistsActivity.class);

        startActivity(artistsIntent);

    }

    public void tracksCategory(View view){

        Intent tracksIntent = new Intent(this,TracksActivity.class);

        startActivity(tracksIntent);

    }

}