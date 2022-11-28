package package01;

public class MainClass01 {

	public static void main(String[] args) {
		/*Arithmetic operators*/
		
		/*Increment operator ++ 
		 *used for integers and floating point numbers
		 * */
		int a = 3;
		float b = 3f;
		System.out.println("Before increment a=" + a);
		System.out.println("Before increment b=" + b);
		a++;
		b++;
		System.out.println("After increment a=" + a);
		System.out.println("After increment b=" + b);
		
		System.out.println("#####################################################################");
		
		/*Arithmetic addition +
		 * used for integers and floating point numbers
		 * */
		int c,d,e;
		c = 3;
		d = 5;
		e = c + d;
		System.out.println("Result of addition is e=" + e);
	
		/*The result type of the calculation corresponds to that of the operand with the largest value range
		 * Example: 
		 * int+int=int, 
		 * int+long=long;
		 * */
		int x;
		long y,z;
		x = 3;
		y = 4;
		z = x + y;
		System.out.println("Result of addition is z=" + z);
		String x_AsString = Integer.toBinaryString(x);
		String y_AsString = Long.toBinaryString(y);
		String z_AsString = Long.toBinaryString(z);
		System.out.println("Binary representation of x is:" + x_AsString );
		System.out.println("Binary representation of y is:" + y_AsString );
		System.out.println("Binary representation of z is:" + z_AsString );
		int x_leadingZeros = Integer.numberOfLeadingZeros(x);
		int y_leadingZeros = Long.numberOfLeadingZeros(y);
		int z_leadingZeros = Long.numberOfLeadingZeros(z);
		System.out.println("Leading zeros in x are:" + x_leadingZeros );
		System.out.println("Leading zeros in y are:" + y_leadingZeros );
		System.out.println("Leading zeros in z are:" + z_leadingZeros );
		
		System.out.println("#####################################################################");
		
		/*Arithmetic subtraction - 
		 * used for integers and floating point numbers
		 * */
		int e1 = 3;
		float f = 4f;
		float g;
		g = e1 -f;
		System.out.println("Result of subtraction is g=" + g);
		
		System.out.println("#####################################################################");
		
		/*Arithmetic multiplication *
		 * used for integers and floating point numbers*/ 
		int c1, d1;
		c1 = 3;
		d1 = c1 *4;
		System.out.println("Result of multiplication is d1=" + d1);
		
		System.out.println("#####################################################################");
		
		/*Arithmetic division /
		 * Integers: 
		 * If both operands are integers, 
		 * the part after the decimal point is truncated.
		 * */	
		int h = 4;
		int i = 3;
		int j;
		j = h/i;
		System.out.println("Result of integer division is j=" + j);
		
		/*Floating point numbers: If at least one operand is a floating point number, 
		 *the result is a floating point number and is not rounded.
		 **/
		int o = 4;
		double p = 3;
		double q = o/p;
		System.out.println("Result of division with double is q=" + q);
		
		System.out.println("#####################################################################");
		
		/*Remainder %
		 * used for integers and floating point numbers*/
		int k = 17;
		int l = 3;
		int m;
		int n;
		m = k % l;
		n = k/l;
		System.out.println("Remainder after integer division is m=" + m);
		System.out.println("Result of integer division is n=" + n);
		
		//how about the floating point numbers?
		float r = 4.5f;
		float s = 2.8f;
		float t = r/s;
		float u = r % s;
		System.out.println("Result of float division is t=" + t);
		System.out.println("Remainder after float division is u=" + u);
	
	}//main
}//class
