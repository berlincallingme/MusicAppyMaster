package com.example.brand.musicappy;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class DepecheActivity  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of words
        final ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Enjoy The Silence", "Depeche Mode"));
        songs.add(new Song("Precious", "Depeche Mode"));
        songs.add(new Song("Useles", "Depeche Mode"));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
        final ListView list = (ListView) findViewById(R.id.list);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Song song = songs.get(position);
                String songName = song.getSongName();
                String bandName = song.getBandName();
                Intent intent = new Intent(DepecheActivity.this, NowPlayingActivity.class);
                intent.putExtra("song name", songName);
                intent.putExtra ("band name", bandName);
                startActivity(intent);
            }
        });
    }
}
