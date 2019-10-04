/*
* Write a program that prompts the user to enter a lowercase or uppercase letter 
* and displays its corresponding number. For a nonletter input, display invalid input.
*/
import java.util.*;

public class Ex4_15 {

	public static void main(String[] args) {
		System.out.println("Enter a letter: ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		char c = input.charAt(0);
		c = Character.toUpperCase(c);
		
		if (c == 'A' || c == 'B' || c == 'C') {
			System.out.println("The corresponding number is 2");
		}
		else if (c == 'D' || c == 'E' || c == 'F') {
			System.out.println("The corresponding number is 3");
		}
		else if (c == 'G' || c == 'H' || c == 'I') {
			System.out.println("The corresponding number is 4");
		}
		else if (c == 'J' || c == 'K' || c == 'L') {
			System.out.println("The corresponding number is 5");
		}
		else if (c == 'M' || c == 'N' || c == 'O') {
			System.out.println("The corresponding number is 6");
		}
		else if (c == 'P' || c == 'Q' || c == 'R' || c == 'S') {
			System.out.println("The corresponding number is 7");
		}
		else if (c == 'T' || c == 'U' || c == 'V') {
			System.out.println("The corresponding number is 8");
		}
		else if (c == 'W' || c == 'X' || c == 'Y' || c == 'Z') {
			System.out.println("The corresponding number is 9");
		}
		else {
			System.out.println(c + " is an invalid input");
		}
		
		scanner.close();
	}
}