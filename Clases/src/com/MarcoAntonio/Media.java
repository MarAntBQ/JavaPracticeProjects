package com.MarcoAntonio;

import java.util.Scanner;

public class Media {

    private String title;
    private String genre;
    private int duration;
    private String sinopsis;

    public String getSinopsis() {
        return sinopsis;
    }
    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
    public Media(String title, String genre, int duration, String sinopsis) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.sinopsis = sinopsis;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
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
        printSomething("Playing: " + title);
    }
    
    public void pause() {
        printSomething("Pausing: " + title);
    }

    private void printSomething(String something) {
        System.out.println(something);
    }

    public void download() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Downloading...." + title);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Downloaded...." + title); 
            }
        });
        thread.start();
    }

    public void moveForward(int minutes) {
        printSomething("Moving forward " + minutes + " minutes");
    }

    @Override
    public String toString() {
        return "The Media Title is: " + title;
    }

    
}
