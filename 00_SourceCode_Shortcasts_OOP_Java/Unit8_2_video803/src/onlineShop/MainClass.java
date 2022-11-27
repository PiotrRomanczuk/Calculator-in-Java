package onlineShop;

import onlineShop.processing.ShoppingCart;
import onlineShop.users.Customer;

public class MainClass {

	public static void main(String[] args) {

		//Declaring some values 
		//for the attributes of the customer
		String lName01 = "Lange";
		String fName01 = "Gerd";
		String birthdate01 = "1967-10-23";
		String s01 = "M";
		
		Customer customer01 = new Customer(lName01,fName01,birthdate01,s01);
		
		System.out.println("Displaying the information for customer01");
		System.out.println("Last name=" + customer01.getLastName());
		System.out.println("First name=" + customer01.getFirstName());
		System.out.println("Birthdate=" + customer01.getBirthdate());
		System.out.println("Gender=" + customer01.getSex());
		System.out.println("customer01.getMinimumOrderValue()=" + customer01.getMinimumOrderValue());
		
		System.out.println("################################################################################################");
		
		//Setting some meaningful values for the ShoppingCart 
		ShoppingCart shoppingCart01 = new ShoppingCart();
		shoppingCart01.setQuantityProducts(5);
		shoppingCart01.setProductSum(25);
		customer01.setShoppingCart(shoppingCart01);
		
		System.out.println("The customer01 has bought " + customer01.getShoppingCart().getQuantityProducts() + " products");
		System.out.println("The sum of the products for customer01 is:" + customer01.getShoppingCart().getProductSum());
		
		
		/*The code block below uses 
		 * the first way for handling exceptions:
		 * 1.�Catch� the exception 
		 * within the method where it is �thrown�
		 * ==> this is done in ShoppingCart.pricePerProduct
		 * */
		//Trying to get the average price per product
//		double averagePricePerProduct = customer01.getShoppingCart().pricePerProduct();
//		System.out.println("averagePricePerProduct=" + averagePricePerProduct);
//		if(averagePricePerProduct == -1){
//			System.out.println("Invalid price per product");
//		}else{
//			System.out.println("The price per product is:" + averagePricePerProduct);
//		}
		
		System.out.println("################################################################################################");
		
		/*The code block below uses 
		 * the second way for handling exceptions:
		 * 2.Pass the Exception back to calling method
		 * Which means that we have to handle the Exception here
		 * */
		try {
			double averagePricePerProduct = customer01.getShoppingCart().pricePerProduct();
			System.out.println("The price per product is:" + averagePricePerProduct);
			
			/*Testing the ArrayIndexOutOfBoundException
			 * The indexing (numbering of elements in the arrays)
			 * starts from the index zero.
			 * Therefore for the example below the element 99 
			 * is at position myArray[2]
			 * 
			 * If you try to access myArray[3] 
			 * you will get */
			int[] myArray = {77,88,99};
			System.out.println("Accessing not existing element from myArray ==> myArray[2]=" + myArray[2]);
		}catch(ArithmeticException ex){
			System.out.println("ArithmeticException in MainClass.main !!!");
			System.out.println("An Exception during the calculation of pricePerProduct has occurred!!");
			System.out.println("The exception message is: " + ex.getMessage());
			System.out.println("-------------------------------------------------------");
		}catch(ArrayIndexOutOfBoundsException ex){
			/*You can list multiple Exceptions,
			 * in multiple catch-blocks
			 * 
			 * You can declare a specific way of handling each one of them*/
			System.out.println("ArrayIndexOutOfBoundsException in MainClass.main !!!");
			System.out.println("An Exception during array access has occured");
			System.out.println("The exception message is: " + ex.getMessage());
			System.out.println("-------------------------------------------------------");
		}catch(Exception ex){
			/*When you have a catch-block for specific Exception,
			 * even if it is only one specific catch-block,
			 * it is recommended that you add a catch block
			 * for all other possible Exceptions at the end 
			 * of the try-block
			 * 
			 * In this way all other Exceptions which can occur during 
			 * the execution of your program
			 * are taken care of*/
			System.out.println("General EXCEPTION in MainClass.main !!!");
			System.out.println("The exception message is: " + ex.getMessage());
			System.out.println("-------------------------------------------------------");
		}
		finally{
			/*If you have to do some cleaning up tasks,
			 * for example closing a connection to a database,
			 * you can do this here,
			 * because this block is always executed*/
			System.out.println("Hello from the finally-block");
			System.out.println("This block is always executed" );	
			System.out.println("Regardles of whether an exception has occured or not" );
			System.out.println("-------------------------------------------------------");
		}
		
		System.out.println("################################################################################################");
		
		//double averagePricePerProduct = customer01.getShoppingCart().pricePerProduct();
		/*Not all standard exceptions integrated in Java have to be handled
		 * There is no compiler error if you try to execute division by zero
		 * There is runtime error
		 * Such exceptions are called "unchecked" exceptions
		 * */
	}//main

}//class
