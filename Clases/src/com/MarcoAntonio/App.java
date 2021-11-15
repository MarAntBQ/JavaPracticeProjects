package com.MarcoAntonio;

public class App {
  public static void main(String[] args) throws Exception {
    Movie backtoTheFuture = new Movie("Back to the Future", "Science Fiction", 20);
    backtoTheFuture.setWonOscar(true);

    Series Arrow = new Series("Flecha", "Super Heroes", 30);
    Arrow.setTitle("Flecha");
    Arrow.setGenre("Super Heroes");
    Arrow.setTotalSeasons(7);
    Arrow.setTotalEpisodes(10);

    Series LegendsofTomorrow = new Series();

    System.out.println(Arrow.getTitle());
    // System.out.println(Arrow.title);
    System.out.println(Arrow);

    backtoTheFuture.play();
    Arrow.pause();
    Arrow.moveForward();

    Media media = new Media("Batman", "Heroes", 20);
    media.setTitle("Batman 2");

    System.out.println(media);

    backtoTheFuture.moveForward(20);
  }
}
