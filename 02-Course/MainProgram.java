import java.util.HashMap;
import java.util.Map;

public class MainProgram {
  public static void main(String[] args) {
    // Declare variable string to store "MarAntBQ.dev"
    String name = "MarAntBQ.dev";
    Number experienceYears = 7;
    Map<String, Number> experienceYearsDev = new HashMap<>();
    experienceYearsDev.put("Frontend", 7);
    experienceYearsDev.put("Backend", 5);
    System.out.println("Hello World from: " + name);
    // Print the experience years of the developer
    System.out.println("Experience years: " + experienceYears);
    System.out.println("Experience years as Frontend Developer: " + experienceYearsDev.get("Frontend"));
    System.out.println("Experience years as Backend Developer: " + experienceYearsDev.get("Backend"));
  }
}
