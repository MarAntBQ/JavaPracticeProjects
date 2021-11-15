package com.MarcoAntonio;

public class Movie extends Media {


    private boolean wonOscar;

    public Movie(String title, String genre, int duration, String sinopsis) {
        super(title, genre, duration, sinopsis);
    }

    @Override
    public int getDuration() {
        return super.getDuration();
    }

    public boolean isWonOscar() {
        return wonOscar;
    }

    public void setWonOscar(boolean wonOscar) {
        this.wonOscar = wonOscar;
    }
}