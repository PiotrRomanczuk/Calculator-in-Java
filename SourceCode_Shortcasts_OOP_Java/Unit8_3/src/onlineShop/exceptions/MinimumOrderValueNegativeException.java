package onlineShop.exceptions;

public class MinimumOrderValueNegativeException extends Exception{
	/*Until now the only known option for modifying 
	 * the available Exceptions was 
	 * throwing a standard Exception 
	 * with a user-defined error message. 
	 * 
	 * But we can also program user-defined exceptions
	 * 
	 * The class with our own Exception must 
	 * inherit from the Java standard class "Exception"
	 * Also it is recommended to have 
	 * the last word in the class name to be "Exception"
	 * */

	//The standard constructor
	public MinimumOrderValueNegativeException(){
		/*Since this class is a Child-class 
		 * for the class Exception,
		 * we can just call the Parent-constructor,
		 * and pass our own message*/
		super("The minimum order value is negative!");
	}
	
	//Overloaded constructor
	public MinimumOrderValueNegativeException(String errorMessage){
		/*If we want to have the flexibility of defining
		 * what the error message should be,
		 * we can use this overloaded constructor
		 * */
		super(errorMessage);
	}
}//class
