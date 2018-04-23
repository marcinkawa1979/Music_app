package com.example.android.music_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);

        View testView = findViewById(R.id.songsActivity);
        testView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playSongIntent = new Intent(SongActivity.this, PlaySong.class);

                startActivity(playSongIntent);
            }
        });
    }
}
