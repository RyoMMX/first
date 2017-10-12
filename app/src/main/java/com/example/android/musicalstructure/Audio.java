package com.example.android.musicalstructure;

/**
 * Created by muhammad on 10/11/2017.
 */

public class Audio {
    private String audioName;
    private String artist;
    private String description;
    private int image;

    public Audio() {
    }

    public Audio(String audioName, int image) {
        this.audioName = audioName;
        this.image = image;
    }

    public Audio(String audioName, int image, String artist, String description) {
        this.audioName = audioName;
        this.image = image;
        this.artist = artist;
        this.description = description;
    }


    public String getAudioName() {
        return audioName;
    }

    public void setAudioName(String audioName) {
        this.audioName = audioName;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
