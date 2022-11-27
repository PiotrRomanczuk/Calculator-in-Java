package data_types_n_simple_calculations;

public class Main {
	public static void main(String[] args) {
		// Exercise 1: Which data type is Math.pi ?
		// - Math.pi is a double

		// Exercise 2: Calculate the area of the circle.
		float r = 10f;
		double area = Math.PI * Math.pow(r, 2);

		System.out.println("The area of the circle is A = " + area);

		// Exercise 3: Modify the code to round the result to two decimal places.
		double areaRounded = Math.round(area * 100.0) / 100.0;
		System.out.println("The area of the circle rounded to two decimals is A = " +
				areaRounded);
	}
}
