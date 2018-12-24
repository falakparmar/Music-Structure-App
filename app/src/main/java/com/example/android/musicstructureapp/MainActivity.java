package com.example.android.musicstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        TextView nowPlaying = (TextView) findViewById(R.id.now_playing);

        nowPlaying.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent nowPlayingIntent = new Intent(MainActivity.this,NowplayingActivity.class);

                startActivity(nowPlayingIntent);

            }

        });
        TextView artists = (TextView) findViewById(R.id.artist);

        artists.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent artistIntent = new Intent(MainActivity.this,ArtistsActivity.class);

                startActivity(artistIntent);

            }

        });

        TextView tracks = (TextView) findViewById(R.id.track);

        tracks.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent tracksIntent = new Intent(MainActivity.this,TracksActivity.class);

                startActivity(tracksIntent);

            }

        });

    }

}