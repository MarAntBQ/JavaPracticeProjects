package com.MarcoAntonio;

public class Movie {
    String name;
    String genre;
    int duration;

    
    public Movie() {
        this.name = "No Tittle";
        this.genre = "No Genre";
        this.duration = 0;
    }

    public Movie(String name) {
        this.name = name;
        this.genre = "No Genre";
        this.duration = 0;
    }
    
    public Movie(String name, String genre) {
        this.name = name;
        this.genre = genre;
        this.duration = 0;
    }
    public Movie(String name, String genre, int duration) {
        this.name = name;
        this.genre = genre;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void play() {
        System.out.println("Playing Movie: " + name);
    }

    public void pause() {
        System.out.println("Pausing Movie: " + name);
    }

    public int getTotalFrames() {
       return  this.duration * 60 * 60;
    }

    @Override
    public String toString() {
        return "The movie is: " + name + ", the genre is: " + genre + " and it has " + duration + " minutes as duration";
    }

}