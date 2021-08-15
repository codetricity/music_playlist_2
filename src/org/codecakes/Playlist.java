package org.codecakes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Playlist {
    private ArrayList<Album> albumArrayList;
    private LinkedList<Song> songLinkedList = new LinkedList<>();

    Playlist(ArrayList<Album> albumArrayList) {
        this.albumArrayList = albumArrayList;
    }

    public void addSongByName(String songName) {
        if (songInAlbums(songName)) {
            Song song = getSongByName(songName);
            songLinkedList.add(song);
        } else {
            System.out.println("Song is not in albums");
        }
    }

    private Song getSongByName(String songName) {
        for (int i =0; i< albumArrayList.size(); i++) {
            Album album = albumArrayList.get(i);
            ArrayList<Song> songs = album.getSongsArrayList();
            for (int j = 0; j< songs.size(); j++) {
                Song song = songs.get(j);
                if (song.getTitle().equals(songName)) {
                    return song;
                }
            }
        }
        return new Song("not found", "0:0");
    }


    private boolean songInAlbums(String songName) {
        for (int i =0; i< albumArrayList.size(); i++) {
            Album album = albumArrayList.get(i);
            ArrayList<Song> songs = album.getSongsArrayList();
            for (int j = 0; j< songs.size(); j++) {
                Song song = songs.get(j);
                if (song.getTitle().equals(songName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void printPlaylist() {
        ListIterator<Song> listIterator = songLinkedList.listIterator();
        while (listIterator.hasNext()) {
            System.out.println("Song: " + listIterator.next().getTitle());
            ;
        }
    }

}
