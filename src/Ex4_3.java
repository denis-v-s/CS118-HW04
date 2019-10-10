/*
* (Geography: estimate areas)
*/

public class Ex4_3 {
  // calculate edge between two vertices
	private static double getDistance(double x1, double x2, double y1, double y2) {
		final double EARTH_RADIUS = 6371.01;
		
		return EARTH_RADIUS * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
	}

	public static void main(String[] args) {
		double charlotte_lat = Math.toRadians(35.2270869);
		double atlanta_lat = Math.toRadians(33.7489954);
		double orlando_lat = Math.toRadians(28.5383355);
		double savannah_lat = Math.toRadians(32.0835407);
		
		double charlotte_long = Math.toRadians(-80.8431267);
		double atlanta_long = Math.toRadians(-84.3879824);
		double orlando_long = Math.toRadians(-81.3792365);
		double savannah_long = Math.toRadians(-81.0998342);

		double d1 = getDistance(charlotte_lat, savannah_lat, charlotte_long, savannah_long);
		double d2 = getDistance(savannah_lat, orlando_lat, savannah_long, orlando_long);
		double d3 = getDistance(orlando_lat, atlanta_lat, orlando_long, atlanta_long);
		double d4 = getDistance(charlotte_lat, atlanta_lat, charlotte_long, atlanta_long);
		double d5 = getDistance(savannah_lat, atlanta_lat, savannah_long, atlanta_long);

		double s = (d1 + d4 + d5) / 2;
		double triangle1 = Math.sqrt(s * (s - d1) * (s - d4) * (s - d5));

		s = (d2 + d3 + d5) / 2;
		double triangle2 = Math.sqrt(s * (s - d2) * (s - d3) * (s - d5));
		
		double area = triangle1 + triangle2;
		System.out.printf("Approximate area is: %.8f", area);
	}
}