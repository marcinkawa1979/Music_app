package com.example.android.music_app;

/**
 * {@Link Song} represents the song.
 * It contains an artist name, a song title.
 * Created by Sir Tryton on 2018-04-07.
 */

public class Song {

    /* Title of the song*/
    private String mSongTitle;

    /* Artist name*/
    private String mArtistName;

    /**
     * Creates a new Song object
     *
     * @param ArtistName is a name of singer
     * @param SongTitle is a name of the song
     */

    public Song(String ArtistName, String SongTitle){
        this.mArtistName = ArtistName;
        this.mSongTitle = SongTitle;
    }

    /**
     * Get the ArtistName
     */
    public String getmArtistName(){return mArtistName;}

    /**
     * Get the song title
     */
    public String getmSongTitle() {return mSongTitle;}
}
