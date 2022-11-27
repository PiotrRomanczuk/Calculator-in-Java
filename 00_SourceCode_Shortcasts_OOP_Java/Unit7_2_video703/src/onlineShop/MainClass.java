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
		
		ShoppingCart shoppingCart01 = new ShoppingCart();
		shoppingCart01.setOrderValue(25);
		customer01.setShoppingCart(shoppingCart01);
		
		System.out.println("customer01.getShoppingCart().getOrderValue()=" + customer01.getShoppingCart().getOrderValue());
	
		System.out.println("#######################################################################################");
		
			
		//invoking the copy constructor for creating a backup copy
		Customer customer01_backupCopy = new Customer(customer01);
		
		System.out.println("Displaying the information for customer01_backupCopy");
		System.out.println("Last name=" + customer01_backupCopy.getLastName());
		System.out.println("First name=" + customer01_backupCopy.getFirstName());
		System.out.println("Birthdate=" + customer01_backupCopy.getBirthdate());
		System.out.println("Gender=" + customer01_backupCopy.getSex());
		System.out.println("customer01_backupCopy.getMinimumOrderValue()=" + customer01_backupCopy.getMinimumOrderValue());
		System.out.println("customer01_backupCopy.getShoppingCart().getOrderValue()=" + customer01_backupCopy.getShoppingCart().getOrderValue());

		System.out.println("#######################################################################################");
		
		//Changing the value in the shopping cart for the backup copy
		customer01_backupCopy.getShoppingCart().setOrderValue(555);
		
		System.out.println("Printing the values after the change");
		
		System.out.println("Value in the original:");
		System.out.println("customer01.getShoppingCart().getOrderValue()=" + customer01.getShoppingCart().getOrderValue());
		System.out.println("---------------------------------------------------------------------------------------");
		
		System.out.println("Value in the copy:");
		System.out.println("customer01_backupCopy.getShoppingCart().getOrderValue()=" + customer01_backupCopy.getShoppingCart().getOrderValue());

		/*Why the change in the copy, also chnaged the original?
		 * ==> shallow copy - only the references were copied, not the objects themselves
		 * 
		 * If you want to achieve a real deep copy,
		 * then in the copy-constructor for a class,
		 * when you are copying a Reference data type,
		 * you have to use the copy-constructor of this Reference Data type
		 * */
	}//main

}//class
