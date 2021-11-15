package com.MarcoAntonio;

import java.util.Scanner;

public class Series extends Media {

    private int totalEpisodes;
    private int totalSeasons;
    private int episodeDuration;

    

    public Series() {
        super("", "", 0);
        totalEpisodes = 0;
        totalSeasons = 0;
        episodeDuration = 0;
    }



    public Series(String title, String genre, int duration, int totalEpisodes, int totalSeasons) {
        super(title, genre, duration);
        this.totalEpisodes = totalEpisodes;
        this.totalSeasons = totalSeasons;
        episodeDuration = duration;
    }



    public Series(String title, String genre, int duration) {
        super(title, genre, duration);
    }



    public int getTotalEpisodes() {
        return totalEpisodes;
    }
    public void setTotalEpisodes(int totalEpisodes) {
        this.totalEpisodes = totalEpisodes;
    }

    @Override
    public int getDuration() {
        return episodeDuration * totalEpisodes * totalSeasons;
    }

    public int getTotalSeasons() {
        return totalSeasons;
    }
    public void setTotalSeasons(int totalSeasons) {
        this.totalSeasons = totalSeasons;
    }
    public int getEpisodeDuration() {
        return episodeDuration;
    }
    public void setEpisodeDuration(int episodeDuration) {
        this.episodeDuration = episodeDuration;
    }

    public void moveForward() {
        System.out.println("How many minutes do you want to move forward?");
        Scanner scanner = new Scanner(System.in);
        int minutes = scanner.nextInt();
        super.moveForward(minutes);
    }
    
}
