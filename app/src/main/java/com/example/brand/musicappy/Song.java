package com.example.brand.musicappy;

public class Song {

    /** Default translation for the word */
    private String mSongname;

    /** Miwok translation for the word */
    private String mBandname;


    public Song(String songName, String bandName) {
        mBandname = bandName;
        mSongname = songName;
    }

    /**
     * Get the default translation of the word.
     */
    public String getSongName() {
        return mSongname;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getBandName() {
        return mBandname;
    }

}