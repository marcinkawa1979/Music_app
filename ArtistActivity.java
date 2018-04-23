package com.example.android.music_app;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        final ArrayList<Song> arrayOfSongs = new ArrayList<Song>();
        arrayOfSongs.add(new Song("art_A", "art_A_a"));
        arrayOfSongs.add(new Song("art_A", "art_a_b"));
        arrayOfSongs.add(new Song("art_A", "art_a_c"));
        arrayOfSongs.add(new Song("art_A", "art_a_d"));
        arrayOfSongs.add(new Song("art_A", "art_a_e"));
        arrayOfSongs.add(new Song("art_B", "art_b_a"));
        arrayOfSongs.add(new Song("art_B", "art_b_b"));
        arrayOfSongs.add(new Song("art_B", "art_b_c"));
        arrayOfSongs.add(new Song("art_B", "art_b_d"));


        SongAdapter adapter = new SongAdapter(this, arrayOfSongs);

        ListView listView = (ListView) findViewById(R.id.list);

        //GridView gridView = (GridView) findViewById(R.id.gridview);

        listView.setAdapter(adapter);

        //
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(ArtistActivity.this, "Position: " + position, Toast.LENGTH_SHORT).show();


                Intent playSongIntent = new Intent(ArtistActivity.this, PlaySong.class);
                startActivity(playSongIntent);
            }
        });

    }
}
