package com.example.android.musicstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
public class TracksActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracks);
        ArrayList<Songs> songs = new ArrayList<Songs>();
        songs.add(new Songs(getText(R.string.s1).toString(),getText(R.string.a1).toString()));
        songs.add(new Songs(getText(R.string.s2).toString(),getText(R.string.a2).toString()));
        songs.add(new Songs(getText(R.string.s3).toString(),getText(R.string.a3).toString()));
        songs.add(new Songs(getText(R.string.s4).toString(),getText(R.string.a4).toString()));
        songs.add(new Songs(getText(R.string.s5).toString(),getText(R.string.a5).toString()));
        songs.add(new Songs(getText(R.string.s6).toString(),getText(R.string.a6).toString()));
        // Create an {@link SongsAdapter}, whose data source is a list of
        // {@link songs}s. The adapter knows how to create list item views for each item
        // in the list.
        SongsAdapter adapter = new SongsAdapter(this, songs);
        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.activity_tracks);
        listView.setAdapter(adapter);
    }


}