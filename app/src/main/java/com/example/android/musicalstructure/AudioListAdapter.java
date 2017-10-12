package com.example.android.musicalstructure;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by muhammad on 10/11/2017.
 */

public class AudioListAdapter extends ArrayAdapter<Audio> {
    public AudioListAdapter(@NonNull Context context, @NonNull ArrayList objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.audio_card_list, parent, false);
        }
        Audio audio = getItem(position);

        TextView name  = (TextView) convertView.findViewById(R.id.name);
        TextView artist = (TextView) convertView.findViewById(R.id.artist);
        ImageView image = (ImageView) convertView.findViewById(R.id.image);

        name.setText(audio.getAudioName());
        artist.setText(audio.getArtist());
        image.setImageResource(audio.getImage());

        return convertView;
    }
}
