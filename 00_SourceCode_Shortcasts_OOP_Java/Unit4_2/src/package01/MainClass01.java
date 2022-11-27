package package01;

public class MainClass01 {

	public static void main(String[] args) {
		//Declaring the variables 
		//and assigning values 
		
		boolean bool  = false;
		
		byte byteNumber = 127;
		short shortNumber = 32767;
		int intNumber = 2147483647;
		long longNumber = 2147483649l; 
	
		float floatNumber = 1.23f;
		double doubleNumber = 345.567d;
		/*A floating-point literal is of type float if it ends with the letter F or f; 
		 *otherwise its type is double and it can optionally end with the letter D or d.*/
		
		char aCharacter = 'H';
		
		String myString = "This is a string";
		
		//Displaying the values of the variables in the console
		System.out.println("This is the values of the bool variable bool=" + bool);
		System.out.println("This is the values of the byte variable byteNumber=" + byteNumber);
		System.out.println("This is the values of the short variable shortNumber=" + shortNumber);
		System.out.println("This is the values of the int variable intNumber=" + intNumber);
		System.out.println("This is the values of the long variable longNumber=" + longNumber);
		System.out.println("This is the values of the float variable floatNumber=" + floatNumber);
		System.out.println("This is the values of the double variable doubleNumber=" + doubleNumber);
		System.out.println("This is the values of the char variable aCharacter=" + aCharacter);
		System.out.println("This is the values of the String variable myString=" + myString);
		
	}//main
}//class
