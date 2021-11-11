import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        String[] Movies = new String[] {"SAW", "Spider-Man No Way Home", "Spider-man", "Avengers", "Transformers"};
        playMovie(Movies);
        System.out.println("");
        String FinalM = pause();
        System.out.println(FinalM);
    }

    public static void playMovie(String[] Movies) {
        int len = Movies.length;
        Random random = new Random();
        int index = random.nextInt(len - 1);
        System.out.println("Playing Movie: " + Movies[index]);        
    }

    public static String pause() {
        System.out.println("Movie paused");
        String Mensaje = "Thanks for visiting our Cinema";
        return Mensaje;
    }
}
