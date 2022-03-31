import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LoopMapExercise {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter 5 numbers, seperated by pressing enter!");
		List<Integer> numbers = new ArrayList<>();
		
		for(int i=0; i<5; ++i) {
			String value = input.nextLine();
			int number = Integer.parseInt(value);
			numbers.add(number);
		}

      
        int sum=0;
        int product=1;
        for(Integer number : numbers ) {
        	sum+=number;
        	product*=number; 
        }
        System.out.println("Sum: " +sum);
        System.out.println("Product: " +product);
        int largest = Collections.max(numbers);
        int smallest = Collections.min(numbers);

        System.out.println("The largest value of the five integers is " + largest + " and the smallest is "+ smallest + ".");
    } 
}
