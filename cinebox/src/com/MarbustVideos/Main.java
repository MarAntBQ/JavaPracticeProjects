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

        //Switch
        int cinemaOption = 3;

        switch(cinemaOption) {
            case 1:
                System.out.println("You're Watching a movie in 2d");
                break;
            case 2:
                System.out.println("You're Watching a movie in 3d");
                break;
            case 3: 
                System.out.println("You're watching a movie in 4d");
                break;
            default:
                System.out.println("Your option it's not available");
        }

    }
}
