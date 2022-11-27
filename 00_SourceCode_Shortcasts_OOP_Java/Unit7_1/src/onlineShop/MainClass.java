package onlineShop;

import onlineShop.processing.ShoppingCart;
import onlineShop.users.Customer;

public class MainClass {

	public static void main(String[] args) {
		/*The new-operator has the purpose of 
		 * creating a new object for a particular class
		 * 
		 *What happens when you invoke the new operator?
		 * ==> the standard constructor is called/invoked
		 * */
		Customer customer01 = new Customer();//invocation of the standard constructor 
		
		System.out.println("Testing the default constructor of the Customer class");
		System.out.println("customer01.getMinimumOrderValue()=" + customer01.getMinimumOrderValue());
		System.out.println("customer01.getShoppingCart()=" + customer01.getShoppingCart());

		//setting the attributes of the customer01
		customer01.setLastName("Lange");
		customer01.setFirstName("Gerd");
		customer01.setBirthdate("1967-10-23");
		customer01.setSex("M");
		
		ShoppingCart w = new ShoppingCart();
		customer01.setShoppingCart(w);
		
		/*When an object is no longer needed,
		 * the garbage collector will destroy it,
		 * so the memory is freed and it can be used again.
		 * This is the concept of "Garbage Collection",
		 * which in simple words means:
		 * "Automatic Memory Management"
		 * 
		 * In some other programming languages 
		 * the developer must explicitly destroy an object.
		 * This is not the case in Java
		 * Thank you Garbage collection!
		 * */
		
	}//main

}//class
