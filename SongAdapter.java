package com.example.android.music_app;



import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * {@link SongAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
 * based on a data source, which is a list of {@link Song} objects.
 * Created by Sir Tryton on 2018-03-12.
 */

public class SongAdapter extends ArrayAdapter<Song> {

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param songs A List of AndroidFlavor objects to display in a list
     */

    public SongAdapter(Activity context, ArrayList<Song> songs) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, songs);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the {@link Song} object located at this position in the list
        Song currentSong = getItem(position);

      /*  //Find the ImageView in the list_item.xml layout with the ID picture
        ImageView pictureImageView = (ImageView) listItemView.findViewById(R.id.picture);
        // Get the mPicture from the current Song object and
        // set this picture on the picture ImageView
        pictureImageView.setImageResource(currentSong.);
*/
        // Find the TextView in the list_item.xml layout with the ID artist
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist);
        // Get the mArtistName from the current Song object and
        // set this text on the artist TextView
        artistTextView.setText(currentSong.getmArtistName());

        // Find the TextView in the list_item.xml layout with the ID default words
        TextView songTextView = (TextView) listItemView.findViewById(R.id.song);
        // Get the mSongTitle from the current Song object and
        // set this text on the song TextView
        songTextView.setText(currentSong.getmSongTitle());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;

        //return super.getView(position, convertView, parent);

    }


}
