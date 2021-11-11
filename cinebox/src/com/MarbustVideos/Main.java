package com.MarbustVideos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Please insert your name?....");
        // String uName = scanner.next();
        // System.out.println("Please insert the number of episodes?....");
        // int totalEpisodes = scanner.nextInt();

        // if (totalEpisodes > 1) {
        // System.out.println("It's a show" + " " + uName);
        // } else if (totalEpisodes == 0){
        // System.out.println("Movie or Show it's not available, please try again after"
        // + " " + uName);
        // } else {
        // System.out.println("It's a movie" + " " + uName);
        // }

        // //While
        // int finalEpisode = 10;
        // while(totalEpisodes <= finalEpisode) {
        // System.out.println("You're watching the Episode: " + totalEpisodes);
        // totalEpisodes++;
        // }

        // //Switch
        // int cinemaOption = 3;

        // switch(cinemaOption) {
        // case 1:
        // System.out.println("You're Watching a movie in 2d");
        // break;
        // case 2:
        // System.out.println("You're Watching a movie in 3d");
        // break;
        // case 3:
        // System.out.println("You're watching a movie in 4d");
        // break;
        // default:
        // System.out.println("Your option it's not available");
        // }

        // System.out.println("Admin System");
        // System.out.println("Insert the Movies: ");
        // int Epi = scanner.nextInt();
        // int[] EpisodeDurationArray = new int[Epi];
        // int n = EpisodeDurationArray.length;
        // int sum = 30;
        // for (int i = 0; i < n; i++) {
        //     EpisodeDurationArray[i] = sum;
        //     sum = sum + 5;
        // }
        // System.out.println("Which Movie do you want to watch.... (1 - " + n + ")");
        // int Movie = scanner.nextInt();
        // Movie--;
        // int Actuar = 0;
        // while (Actuar == 0) {
        //     if (Movie >= 0 && Movie < n) {
        //         Actuar = 1;
        //     } else {
        //         System.out.println("Please insert the value in the range");
        //         System.out.println("Which Movie do you want to watch.... (1 - " + n + ")");
        //         Movie = scanner.nextInt();
        //         Movie--;
        //         Actuar = 0;
        //     }
        // }
        // if (Movie >= 0 && Movie < n) {
        //     int episodeDur = EpisodeDurationArray[Movie];
        //     System.out.println("The movie you selected has " + episodeDur + " minutes length");
        // }

        String[] movies = new String[] {"Up", "Avengers", "Mario Bross", "Defenders", "Shang Chi"};
        for (String title : movies) {
            if (!title.contains("U")) {
                System.out.println(title);
            }
        }
    }
}
