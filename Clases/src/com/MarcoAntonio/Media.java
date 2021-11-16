package com.MarcoAntonio;

import java.util.Scanner;

import javax.swing.text.AbstractDocument.Content;

public class Media {

    private String title;
    private String genre;
    private int duration;
    private String sinopsis;
    private String content = "";

    @Override
    public boolean equals(Object object) {
        if (object instanceof Media) {
            return this.title.equals(((Media) object).getTitle()) && this.genre.equals(((Media) object).getGenre());
        } else {
            return false;
        }
    }

    public String getSinopsis() {
        return sinopsis;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
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

    public void moveForward(int minutes) {
        printSomething("Moving forward " + minutes + " minutes");
    }

    @Override
    public String toString() {
        return "The Media Title is: " + title;
    }

    
}
