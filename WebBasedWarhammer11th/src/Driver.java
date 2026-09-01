//import java.io.BufferedReader;
//import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;
import army.Army;

public class Driver {
	public static void main (String[]args) throws IOException {
		Scanner scnr = new Scanner(System.in);
		
		int input = 0;
		
		while (input != -1) {
			System.out.println("Please select an input below: ");
			System.out.println("1. Create a new Army");
			System.out.println("2. Create a new Unit");
			System.out.println("3. Attack with a unit");
			System.out.println("4. Quit");
			
			
			
			input = Integer.parseInt(scnr.nextLine());
			
			if(input == 1) {
				
				Army a1 = new Army();
			} else if (input == 2) {
				
			} else if (input == 3) {
				
			} else if (input == 4) {
				
			} else {
				input = 0;
			}
			
		}
		
		
	}

}
