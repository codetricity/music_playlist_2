package org.codecakes;

public class Song {
    public String getTitle() {
        return title;
    }

    public String getDuration() {
        return duration;
    }

    private String title;
    private String duration;

    Song(String title, String duration){
        this.title = title;
        this.duration = duration;
    }
}
