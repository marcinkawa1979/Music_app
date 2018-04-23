package com.example.android.music_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Finds the view that shows artist
        TextView artist = findViewById(R.id.artist);


        // Set a click listener on that view
        artist.setOnClickListener(new View.OnClickListener() {
            @Override
            // The code in this method will be executed when the artist View is clicked on.
            public void onClick(View view) {

                Intent artistActivityIntent = new Intent(MainActivity.this, ArtistActivity.class);
                startActivity(artistActivityIntent);
            }
        });

        TextView songs = findViewById(R.id.songsField);
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            // The code in this method will be executed when the artist View is clicked on.
            public void onClick(View view) {

                Intent songsActivityIntent = new Intent(MainActivity.this, SongActivity.class);
                startActivity(songsActivityIntent);
            }
        });
    }
}
