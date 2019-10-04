/* 
* (Vowel or consonant?) Write a program that prompts the user to enter a letter and check whether 
* the letter is a vowel or consonant. For a nonletter input, display invalid input.
*/
import java.util.*;

public class Ex4_13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a letter: ");
		String input = scanner.nextLine();
		char c = input.charAt(0);
		
		HashSet<Character> vowels = new HashSet<Character>(
			Arrays.asList('a', 'e', 'i', 'o', 'u', 'y')
		);
		
		Set<Character> consontants = new HashSet<Character>(
			Arrays.asList(
				'b', 'c', 'd', 'f', 'g', 'h', 'j', 
				'k', 'l', 'm', 'n', 'p', 'q', 'r', 
				's', 't', 'v', 'w', 'x', 'y', 'z'
			)
		);
				
		if (vowels.contains(Character.toLowerCase(c))) {
			System.out.println(c + " is a vowel");
		}
		else if (consontants.contains(Character.toLowerCase(c))) {
			System.out.println(c + " is a consonant");
		}
		else {
			System.out.println(c + " is an invalid input");
		}
		
		scanner.close();
	}
}