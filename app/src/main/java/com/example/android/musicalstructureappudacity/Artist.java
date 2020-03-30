package com.example.android.musicalstructureappudacity;

public class Artist {

    private String mNameOfComposer;

    private String mArtist;

    public Artist(String nameOfComposer, String artist) {
        mNameOfComposer = nameOfComposer;
        mArtist = artist;
    }

    public String getNameOfComposer() {
        return mNameOfComposer;
    }

    public String getArtist() {
        return mArtist;
    }
}

