package com.MarcoAntonio;

public class App {
    public static void main(String[] args) throws Exception {
        Movie Avengers = new Movie("The Avengers 4: End Game", "Action", 210);

        Movie Spiderman = new Movie("Spider-Man: No Way Home", "Super Heroes", 150);

        Movie starWars = new Movie();
        
        Movie starWars2 = new Movie("La Guerra de las Galaxias 2");

        Movie starWars3 = new Movie("La Guerra de las Galaxias 2", "Galactic");

        Spiderman.play();
        starWars.pause();
        Avengers.play();
        starWars2.play();
        starWars3.play();

        System.out.println("The " + Spiderman.getName() + " movie, has " + Spiderman.getTotalFrames() + " total frames");
        System.out.println("The " + starWars.getName() + " movie, has " + starWars.getTotalFrames() + " total frames");
    }
}
