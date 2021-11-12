package com.MarcoAntonio;

public class Movie extends Media {

    public Movie(String title, String genre, int duration) {
        super(title, genre, duration);
        //TODO Auto-generated constructor stub
    }

    boolean wonOscar;

    public boolean isWonOscar() {
        return wonOscar;
    }

    public void setWonOscar(boolean wonOscar) {
        this.wonOscar = wonOscar;
    }

    public void moveForward() {
    }

}