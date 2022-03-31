import java.util.HashMap;
import java.util.Scanner;

public class VehicleHashMap {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashMap<String, String> car = new HashMap<>();
		car.put("Honda", "Civic");
		car.put("Toyota", "Camry");
		car.put("Ford", "Fusion");
		System.out.print("What car (model) are you looking for?");
        String response = input.next();
        String value = car.get(response);
        car.containsKey(response);
        if(true) {
        	System.out.print("Oh, you're looking for a " + response + "?" + " Our " + value + "  selection is right over here!");
        }
	}

}
