package com.MarcoAntonio;

public class App {
  public static void main(String[] args) throws Exception {
    Movie backtoTheFuture = new Movie("Back to the Future", "Science Fiction", 120, "Trapped in the past, Marty inadvertently prevents his future parents' meeting—threatening his existence—and is forced to reconcile the pair and somehow get back to the future.");
    backtoTheFuture.setWonOscar(true);

    Series Arrow = new Series();
    Arrow.setTitle("Flecha");
    Arrow.setGenre("Super Heroes");
    Arrow.setSinopsis("Cuando Oliver Queen, un billonario mujeriego, que se presumía había fallecido, regresa a casa a la ciudad Starling, luego de cinco años de quedar atrapado en una isla remota en el Pacífico, él esconde los cambios creados por la experiencia en sí mismo, mientras busca la reconciliación con su ex Laurel; él secretamente lleva dos vidas paralelas, en el día actúa como el filántropo descomplicado que solía ser y en la noche saca a relucir su ego alterno como Arrow. Este personaje es una clase de super héroe que trata de corregir los errores de su familia y restaurar la gloria que tenía la ciudad previamente, su misión se complica por el padre de Laurel, quien es el detective Quentin Lance y está determinado a poner al vigilante en la cárcel.");
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
    Arrow.download();
  }
}
