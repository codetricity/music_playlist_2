package org.codecakes;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Album> songLibrary = buildSongLibrary();
//        printSongLibrary(songLibrary);
        Playlist playlist = new Playlist(songLibrary);

        playlist.addSongByName("Beat it");
        runPlaylist(playlist);


    }

    /***************  Test Data ***************************/
    // build library of songs
    public static ArrayList<Album> buildSongLibrary() {
        ArrayList<Album> albumArrayList = new ArrayList<>();
        Album thriller = new Album("Thriller");
        thriller.addSong(new Song("Beat it", "4:18"));
        thriller.addSong(new Song("Billie Jean", "4:54"));
        albumArrayList.add(thriller);

        Album backInBlack = new Album("Back in Black");
        backInBlack.addSong(new Song("Hells Bells", "5:10"));
        backInBlack.addSong(new Song("Back in Black", "4:15"));
        albumArrayList.add(backInBlack);
        return  albumArrayList;
    }

    public static void printSongLibrary(ArrayList<Album> songLibrary) {
        System.out.println("Listing all songs in library");
        for (int i = 0; i < songLibrary.size(); i++) {
            System.out.println("-----------------------------");
            Album album = songLibrary.get(i);
            System.out.println("Album: " + album.getAlbumTitle());
            ArrayList<Song> songs = album.getSongsArrayList();
            for (int j = 0; j < songs.size(); j++) {
                System.out.println(songs.get(j).getTitle() + "\t\t" + songs.get(j).getDuration());
            }
        }

    }

    public static void printMenu() {
        System.out.println("Playlist options");
        System.out.println("0: quit");
        System.out.println("1: next song");
        System.out.println("2: previous song");
        System.out.println("3: print playlist");
        System.out.println("4: print library of songs");
        System.out.println("5: menu");
    }

    public static void runPlaylist(Playlist playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        printMenu();

        while (!quit) {
            int menuSelection = scanner.nextInt();
            scanner.nextLine();
            switch(menuSelection) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("selected 1");
                    break;
                case 2:
                    System.out.println("selected 2");
                    break;
                case 3:
                    System.out.println("selected 3");
                    break;
                case 4:
                    printSongLibrary(playlist.getAlbumArrayList());
                    break;
                case 5:
                    printMenu();
                    break;
            }
        }

    }



}
