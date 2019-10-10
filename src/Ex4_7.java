import java.util.*;

/**
 * (Corner point coordinates)
 */
public class Ex4_7 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter the radius of the bounding circle: ");
    double r = scanner.nextDouble();

    final double N_SIDES= 5; // number of pentagon sides
    final double DIAMETER = 360;
    // 360 / 5 = angle
    double p1Angle = DIAMETER / N_SIDES; // 72
    double p2Angle = 0;
    double p5Angle = p1Angle * 2;
    double p4Angle = p1Angle * 3;
    double p3Angle = p1Angle * 4;
    
    double ax = r * Math.sin(Math.toRadians(p1Angle));
    double ay = r * Math.cos(Math.toRadians(p1Angle));
    double bx = r * Math.sin(Math.toRadians(p2Angle));
    double by = r * Math.cos(Math.toRadians(p2Angle));
    double cx = r * Math.sin(Math.toRadians(p3Angle));
    double cy = r * Math.cos(Math.toRadians(p3Angle));
    double dx = r * Math.sin(Math.toRadians(p4Angle));
    double dy = r * Math.cos(Math.toRadians(p4Angle));
    double ex = r * Math.sin(Math.toRadians(p5Angle));
    double ey = r * Math.cos(Math.toRadians(p5Angle));

    System.out.println("The coordinates of five points on the pentagon are");
    System.out.printf("(%.2f), (%.2f)%n", ax, ay);
    System.out.printf("(%.2f), (%.2f)%n", bx, by);
    System.out.printf("(%.2f), (%.2f)%n", cx, cy);
    System.out.printf("(%.2f), (%.2f)%n", dx, dy);
    System.out.printf("(%.2f), (%.2f)%n", ex, ey);

    scanner.close();
  }
}