package com.example.android.musicstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ArtistsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);
        Button HomeButton = (Button) findViewById(R.id.home_button);
        Button PlaybyButton = (Button) findViewById(R.id.Playedby);
        Button TrackButton = (Button) findViewById(R.id.track);

        HomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentHome = new Intent(view.getContext(), MainActivity.class);
                startActivity(intentHome);
            }
        });

        PlaybyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentPlayby = new Intent(view.getContext(), NowplayingActivity.class);
                startActivity(intentPlayby);
            }
        });

        TrackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentTrack = new Intent(view.getContext(), TracksActivity.class);
                startActivity(intentTrack);
            }
        });
        }
}