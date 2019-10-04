/*
* (Geography: estimate areas) Use the GPS locations for Atlanta, Georgia; Orlando, Florida; Savannah, Georgia; 
* and Charlotte, North Carolina in the figure in Section 4.1 to compute the estimated area enclosed by these four 
* cities. (Hint: Use the formula in Programming Exercise 4.2 to compute the distance between two cities. Divide 
* the polygon into two triangles and use the formula in Programming Exercise 2.19 to compute the area of a triangle.)
*/

public class Ex4_3 {
  // calculate edge between two vertices
	private static double getEdge(double x1, double x2, double y1, double y2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}

	public static void main(String[] args) {
		double charlotte_lat = 35.2270869;
		double atlanta_lat = 33.7489954;
		double orlando_lat = 28.5383355;
		double savannah_lat = 32.0835407;
		
		double charlotte_long = -80.8431267;
		double atlanta_long = -84.3879824;
		double orlando_long = -81.3792365;
		double savannah_long = -81.0998342;
		
		double charlotte_atlanta = getEdge(charlotte_lat, atlanta_lat, charlotte_long, atlanta_long);
		double charlotte_savannah = getEdge(charlotte_lat, savannah_lat, charlotte_long, savannah_long);
		double savannah_orlando = getEdge(savannah_lat, orlando_lat, savannah_long, orlando_long);
		double orlando_atlanta = getEdge(orlando_lat, atlanta_lat, orlando_long, atlanta_long);
		
		double triangle1 = (charlotte_atlanta * orlando_atlanta) / 2;
		double triangle2 = (charlotte_savannah * savannah_orlando) / 2;
		
		double quadrilateral_area = triangle1 + triangle2;
		System.out.println("Approximate area is: " + quadrilateral_area);
	}
}