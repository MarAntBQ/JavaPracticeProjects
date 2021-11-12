package com.MarcoAntonio;

public class App {
    public static void main(String[] args) throws Exception {
        Movie Avengers = new Movie("The Avengers 4: End Game", "Action", 210);

        Movie Spiderman = new Movie("Spider-Man: No Way Home", "Super Heroes", 150);

        Movie starWars = new Movie();
        
        Movie starWars2 = new Movie("La Guerra de las Galaxias 2");

        Movie starWars3 = new Movie("La Guerra de las Galaxias 2", "Galactic");


        System.out.println(starWars);
    }
}
