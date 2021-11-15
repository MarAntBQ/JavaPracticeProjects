package com.MarcoAntonio;

public class Movie extends Media {


    private boolean wonOscar;

    public Movie(String title, String genre, int duration) {
        super(title, genre, duration);
        //TODO Auto-generated constructor stub
    }


    public boolean isWonOscar() {
        return wonOscar;
    }

    public void setWonOscar(boolean wonOscar) {
        this.wonOscar = wonOscar;
    }
}