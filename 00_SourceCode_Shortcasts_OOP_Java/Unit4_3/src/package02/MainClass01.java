package package02;

public class MainClass01 {

	public static void main(String[] args) {
		/*Relational operators*/
		
		/*Equality for primitive data types
		 *The result of the comparison is of type boolean*/
		int z1, z2;
		boolean e1;
		z1 = 4;
		z2 = 3;
		e1 = (z1 == z2);
		System.out.println("Result of comparison for primitive data types e1=" + e1);		
		
		System.out.println("#####################################################################");
		
		/*Equality for reference data types
		 *The '==' compares the references,
		 *which means the 'area of the memory'
		 *to which the objects refer to.
		 *If the two objects refer to the same memory area,
		 *we say that the have the same reference, they refer to the same object.
		 *In this case the '==' operator will return true*/
		Customer customer1 = new Customer();
		Customer customer2 = customer1;
		boolean e44 = (customer1 == customer2);
		System.out.println("First result of comparison for reference data types e44=" + e44);		
		
		/*But if the two objects occupy different areas in the memory, 
		 * the '==' operator will return false*/
		Customer customer3 = new Customer();
		Customer customer4 = new Customer();
		boolean e45 = (customer3 == customer4);
		System.out.println("First result of comparison for reference data types e45=" + e45);		
		
		System.out.println("#####################################################################");
		
		/*The operator 'Less than' ,
		 * also called 'smaller than'
		 * */
		int z5, z6;
		boolean e5;
		z5 = 5;
		z6 = 6;//exchange this number to induce a different result
		e5 = (z5 < z6);
		System.out.println("Result of the operator 'less than' e5=" + e5);
		
		System.out.println("#####################################################################");
		
		/*The operator 'Less than or equal to'
		 * also called 'smaller than or equal to'
		 * */
		int z7, z8;
		boolean e6;
		z7 = 8;
		z8 = 7;//exchange this number to induce a different result
		e6 = (z7 <= z8);
		System.out.println("Result of the operator 'less than or equal to' e6=" + e6);
		
		System.out.println("#####################################################################");
		
		/*The operator 'Greater than'
		 * also called 'bigger than'
		 * */
		int z9, z10;
		boolean e7;
		z9 = 9;
		z10 = 10;//exchange this number to induce a different result
		e7 = (z10 > z9);
		System.out.println("Result of the operator 'greater than' e7=" + e7);
		
		System.out.println("#####################################################################");
		
		/*The operator 'Greater than or equal'
		 * also called 'bigger than or equal'
		 * */
		int z11, z12;
		boolean e8;
		z11 = 10;
		z12 = 11;//exchange this number to induce a different result
		e8 = (z11 >= z12);
		System.out.println("Result of the operator 'greater than or equal' e8=" + e8);
		
		System.out.println("#####################################################################");
		
		/*Type comparison with the operator 'instanceof'
		 * This operator is used for reference data types
		 * The operator 'instanceof' returns TRUE 
		 * if 
		 * the data type of the operand on the left 
		 * is the same as
		 * the data type of the operand on the right */
		Customer k1;
		boolean e9;
		k1 = new Customer();//instantiating the Customer-object k1
		e9 = (k1 instanceof Customer);
		System.out.println("Result of the operator 'instanceof' e9=" + e9);
		
		System.out.println("#####################################################################");
		
		/*Testing with the operator for non-equality != 
		 * */
		int z13, z14;
		boolean e10;
		z13 = 14;
		z14 = 14;//exchange this number to induce a different result
		e10 = (z13 != z14);
		System.out.println("Result of the operator 'not equal to' e10=" + e10);
		
		System.out.println("#####################################################################");
		
		/*Concatenation of strings
		 * also called 'connecting of strings'
		 * This is done with the basic operator '+'
		 * */
		String s1 = "I ";
		String s2 = "am ";
		String s3 = "a ";
		String s4 = "concatenated ";
		String s5 = "String";
		String s6 = s1 + s2 + s3 +s4 +s5;
		System.out.println("Result of concatenation is s6=" + s6);
		
	}//main

}//class
