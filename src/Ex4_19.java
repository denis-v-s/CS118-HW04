/*
* (Business: check ISBN-10) Rewrite Programming Exercise 3.9 by entering the ISBN number as a string.
*/
import java.util.*;

public class Ex4_19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the first 9 digits of an ISBN as a string: ");
		String input = scanner.nextLine();
		
		if (input.length() != 9) {
			System.out.println("Invalid input, the string must be 9 characters long");
			System.exit(1);
		}
		
		// calculate checksum
		int calc = 0;
		for (int i = 0; i < input.length(); i++) {
			calc += (input.charAt(i) - 48) * (i + 1);
		}
		
		int checksum = calc % 11;
		
		System.out.printf("The ISBN-10 number is %s%s", 
			input, 
			(checksum == 10) ? "X" : checksum + ""
		);
		
		// 013601267 = 0136012671
		// 013031997 = 013031997X
		scanner.close();
	}
}