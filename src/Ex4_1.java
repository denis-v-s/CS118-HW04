import java.util.*;

public class Ex4_1 {
	public static void main(String[] args) {
		// Write a program that prompts the user to enter the length from the center of a pentagon to a vertex and computes the area of the pentagon
		
		System.out.print("Enter the length from the center to a vertex: ");
		Scanner scanner = new Scanner(System.in);

		double r = scanner.nextDouble();
		double s = 2 * r * Math.sin(Math.PI / 5);
		double area = (5 * (s * s)) / (4 * Math.tan(Math.PI / 5));
		
		System.out.printf("The area of the pentagon is %.2f", area);
		
		scanner.close();
	}
}