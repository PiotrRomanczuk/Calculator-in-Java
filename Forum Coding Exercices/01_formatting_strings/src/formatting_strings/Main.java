package formatting_strings;

public class Main {
	public static void example(String[] args) {
		System.out.println("Exercise 1");
		String example1 = String.format(">%d<", 35);
		System.out.println(example1);

		String example2 = String.format(">%7d<", 35);
		System.out.println(example2);

		String example3 = String.format(">%07d<", 35);
		System.out.println(example3);

		String example4 = String.format(">%-7d<", 35);
		System.out.println(example4);

		String example5 = String.format(">%7.3f<", 35.0);
		System.out.println(example5);
	}

	public static void main(String[] args) {
		example(null);
		// Exercise 1: Based on the output you observed, what is the difference between
		// %d, %7d, %07d, %-7d and %7.3f?
		// %d - Formats the integer to be output without manipulation
		// %7d - Puts spaces in front of the integer to fill the remainder of 7
		// characters
		// %07d - Instead of filling the remainder with spaces, it is specified that the
		// remainder should be filled with "0"
		// %-7d - The effect of %7d but in a reverse order, filling the remainder of 7Ŕ
		// characters with spaces after the integer
		// %7.3f - Spaces are put in front of the float to fill the remainder of 7
		// characters and the float is formatted to have 3 decimals

		System.out.println("\nExercise 2");
		// Exercise 2: Is it possible to use %f together with an integer?
		// You cannot use %f together with an integer as it will result in an error
		try {
			String exercise2 = String.format(">%f<", 35);
			System.out.println(exercise2);
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("\nExercise 3");
		// Exercise 3: Print the string '000001234' in two different ways.
		String exercise3_1 = String.format("%06d%d%d%d", 1, 2, 3, 4);
		System.out.println(exercise3_1);

		String exercise3_2 = String.format("%09d", 1234);
		System.out.println(exercise3_2);

		System.out.println("\nExercise 4");
		// Exercise 4: Print the string '0032,12000' by formatting the float number
		// 32.12.
		// 010 specifies that the total length should be 10 characters and .5f specifies
		// to fill the remainder of the next 5 characters with 0
		// so 010 fills the remainder in front of the float with two 0
		String exercise4 = String.format("%010.5f", 32.12);
		System.out.println(exercise4);
	}

}
