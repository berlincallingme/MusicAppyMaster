package com.example.brand.musicappy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NowPlayingActivity  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);
        String songName = getIntent().getExtras().getString("song name");
        String bandName = getIntent().getExtras().getString("band name");
        TextView band = findViewById(R.id.bandName);
        band.setText(bandName);
        TextView song = findViewById(R.id.currentSong);
        song.setText(songName);
    }
        }