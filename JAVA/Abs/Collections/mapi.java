package JAVA.Abs.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mapi {
    public static void main(String[] args) {
        Map<String, String> cityMap = new HashMap<>();
        cityMap.put("Ram", "Chennai");
        cityMap.put("somu", "Mumbai");
        cityMap.put("naren", "Kolkata");
        cityMap.put("vishnu", "Chennai");
        cityMap.put("sanjay", "Mumbai");

        //@SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a name: ");
            String namein = scanner.nextLine();
            String cityName = cityMap.getOrDefault(namein, "Name not found");
            System.out.println("The city of " + namein + " is: " + cityName);
        }

      
    }
}

