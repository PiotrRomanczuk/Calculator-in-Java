package onlineShop;

import onlineShop.exceptions.MinimumOrderValueNegativeException;
import onlineShop.processing.ShoppingCart;
import onlineShop.users.Customer;
import onlineShop.users.PremiumCustomer;

public class MainClass {

	public static void main(String[] args) {

		//Declaring some values 
		//for the attributes of the customer01
		String lName01 = "Lange";
		String fName01 = "Gerd";

		
		//Declaring some values 
		//for the attributes of the premium customer
		String lName02 = "Customer";
		String fName02 = "Premium";
		
		Customer customer01 = new Customer(lName01,fName01);
		PremiumCustomer premiumCustomer = new PremiumCustomer(lName02,fName02);
		
		System.out.println("Displaying the information for customer01");
		System.out.println("Last name=" + customer01.getLastName());
		System.out.println("First name=" + customer01.getFirstName());
		System.out.println("Birthdate=" + customer01.getBirthdate());
		System.out.println("Gender=" + customer01.getSex());
		
		System.out.println("########################################################################################");
		
		System.out.println("Displaying the information for the premiumCustomer");
		System.out.println("Last name=" + premiumCustomer.getLastName());
		System.out.println("First name=" + premiumCustomer.getFirstName());
		System.out.println("Birthdate=" + premiumCustomer.getBirthdate());
		System.out.println("Gender=" + premiumCustomer.getSex());
		
		System.out.println("########################################################################################");
		
		//customer01.setMinimumOrderValue(-10);
		premiumCustomer.setMinimumOrderValue(-10);
		try {
			System.out.println("customer01.getMinimumOrderValue()=" + customer01.getMinimumOrderValue());
			System.out.println("premiumCustomer.getMinimumOrderValue()=" + premiumCustomer.getMinimumOrderValue());
		} catch (MinimumOrderValueNegativeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}//main

}//class
