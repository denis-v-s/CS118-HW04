/*
* (Days of a month) Write a program that prompts the user to enter the year and the 
* first three letters of a month name (with the first letter in uppercase) and displays 
* the number of days in the month.
*/
import java.util.*;

public class Ex4_17 {
	private static boolean isLeapYear(int year) {
		return (year % 4 == 0) && !(year % 100 == 0 && year % 400 != 0);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a year: ");
		int year = scanner.nextInt();
		
		System.out.println("Enter a month: ");
		String month = scanner.nextLine();
		
		// 31 day set
		Set<String> set31 = new HashSet<String>(Arrays.asList(
			new String[] { "Jan", "Mar", "Jul", "Aug", "Oct", "Dec" }
		));
		
		// 30 day set
		Set<String> set30 = new HashSet<String>(Arrays.asList(
			new String[] { "Apr", "Jun", "Sep", "Nov" }
		));
		
		if (set31.contains(month)) {
			System.out.printf("%s %d has 31 days", month, year);
		}
		else if (set30.contains(month)) {
			System.out.printf("%s %d has 30 days", month, year);
		}
		else if (month == "Feb") {
			if (isLeapYear(year)) {
				System.out.printf("%s %d has 29 days", month, year);
			}
			else {
				System.out.printf("%s %d has 28 days", month, year);
			}
		}
		else {
			Set<String> allValidMonths = new HashSet<>();
			allValidMonths.addAll(set31);
			allValidMonths.addAll(set30);
			allValidMonths.add("Feb");
			if (!allValidMonths.contains(month)) {
				System.out.printf("%s is not a correct month name", month);
			}
		}
		
		scanner.close();
	}
}
