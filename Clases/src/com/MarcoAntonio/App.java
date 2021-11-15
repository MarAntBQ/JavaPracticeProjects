package com.MarcoAntonio;

public class App {
  public static void main(String[] args) throws Exception {
    Movie backtoTheFuture = new Movie("Back to the Future", "Science Fiction", 120);
    backtoTheFuture.setWonOscar(true);

    Series Arrow = new Series();
    Arrow.setTitle("Flecha");
    Arrow.setGenre("Super Heroes");
    Arrow.setEpisodeDuration(50);
    Arrow.setTotalEpisodes(10);
    Arrow.setTotalSeasons(7);

    Series LegendsofTomorrow = new Series();

    // System.out.println(Arrow.getTitle());
    // System.out.println(Arrow.title);
    // System.out.println(Arrow);

    //backtoTheFuture.play();
    //Arrow.pause();
    //Arrow.moveForward();

    // Media media = new Media("Batman", "Heroes", 20);
    // media.setTitle("Batman 2");

    // System.out.println(media);

    //backtoTheFuture.moveForward(20);

    System.out.println(backtoTheFuture.getDuration());
    System.out.println(Arrow.getDuration());
  }
}
