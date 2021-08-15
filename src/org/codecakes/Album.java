package org.codecakes;

import java.util.ArrayList;

public class Album {


    private String albumTitle;
    private ArrayList<Song> songsArrayList = new ArrayList();

    Album(String albumTitle) {this.albumTitle = albumTitle;}

    public void addSong(Song song) {
        songsArrayList.add(song);
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public ArrayList<Song> getSongsArrayList() {
        return songsArrayList;
    }
}
