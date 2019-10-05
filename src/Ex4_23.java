import java.util.Scanner;

/**
 * (Financial application: payroll) Write a program that reads the following
 * information and prints a payroll statement: Employee’s name (e.g., Smith)
 * Number of hours worked in a week (e.g., 10) Hourly pay rate (e.g., 9.75)
 * Federal tax withholding rate (e.g., 20%) State tax withholding rate (e.g.,
 * 9%)
 */
public class Ex4_23 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter employee’s name: ");
    String name = scanner.nextLine();

    System.out.print("Enter number of hours worked in a week: ");
    double hours = scanner.nextDouble();

    System.out.print("Enter hourly pay rate: ");
    double payRate = scanner.nextDouble();

    System.out.print("Enter federal tax withholding rate: ");
    double federalTaxRate = scanner.nextDouble();

    System.out.print("Enter state tax withholding rate: ");
    double stateTaxRate = scanner.nextDouble();

    double grossPay = hours * payRate;
    double federalWitholding = grossPay * federalTaxRate;
    double stateWitholding = grossPay * stateTaxRate;
    double netPay = grossPay - federalWitholding - stateWitholding;

    System.out.println("Employee's name: " + name);
    System.out.println("Hours Worked: " + hours);
    System.out.printf("Pay Rate: $%.2f \r\n", payRate);
    System.out.printf("Gross Pay: $%.2f\r\n", grossPay);
    System.out.println("Deductions:");
    System.out.printf("     Federal Witholding (%2.1f%%): $%.2f\r\n", federalTaxRate * 100, federalWitholding);
    System.out.printf("     State Witholding (%2.1f%%): $%.2f\r\n", stateTaxRate * 100, stateWitholding);
    System.out.printf("     Total Deductions: $%.2f \r\n", federalWitholding + stateWitholding);
    System.out.printf("Net Pay: $%.2f", netPay);

    scanner.close();
  }
}