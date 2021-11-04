package com.MarbustVideos;
public class Main {
    public static void main(String[] args) throws Exception {
        int totalEpisodes = 1;

        if (totalEpisodes > 1) {
            System.out.println("It's a show");
        } else if (totalEpisodes == 0){
            System.out.println("Movie or Show it's not available, please try again after");
        } else {
            System.out.println("It's a movie");
        }

        //While
        int finalEpisode = 10;
        while(totalEpisodes <= finalEpisode) {
            System.out.println("You're watching the Episode: " + totalEpisodes);
            totalEpisodes++;
        }

    }
}
