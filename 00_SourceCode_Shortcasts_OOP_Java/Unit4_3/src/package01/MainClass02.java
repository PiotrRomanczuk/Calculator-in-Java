package package01;

public class MainClass02 {

	public static void main(String[] args) {
		/*Logical operators*/
		
		/*Logical complement(negation) 
		 * NOT(true) ==> false
		 * NOT(false) ==> true
		 *  */
		boolean b1;
		boolean b2 = false;
		b1 = !b2;
		System.out.println("After negation b1=" + b1);
		
		System.out.println("#####################################################################");
		
		/*Logical AND , can be used on boolean 
		 * false AND false = false
		 * false AND true  = false
		 * true  AND false = false
		 * true  AND true  = true
		 * */
		boolean b3;
		boolean b4 = true;
		boolean b5 = true;
		b3 = b4 && b5;
		System.out.println("Result of logical AND is b3=" + b3);
		
		System.out.println("#####################################################################");
		
		/*Logical OR , can be used on boolean 
		 * false OR false = false
		 * false OR true  = true
		 * true  OR false = true
		 * true  OR true  = true
		 * */
		boolean b6;
		boolean b7 = false;
		boolean b8 = true;
		b6 = b7 || b8;
		System.out.println("Result of logical OR is b6=" + b6);
		
		System.out.println("#####################################################################");
		
		/*Exclusive OR , denoted as XOR , can be used on boolean
		 * denoted by a carrot (^) symbol
		 * true  XOR true  = false
		 * true  XOR false = true
		 * false XOR true  = true
		 * false XOR false = false
		 * */
		boolean b9;
		boolean b10 = false;
		boolean b11 = true;
		b9 = b10 ^ b11;
		System.out.println("Result of logical OR is b9=" + b9);
		
	}//main
}//class
