package package01;

public class OnlineShop {

	public static void main(String args[]) {
				
		//Generation of an object called customer1, 
		//which is an instance of the class Customer
		Customer customer1 = new Customer();
		
		//Invocation of the setter methods
		//on the object customer1 
		customer1.setLastname("Lange");
		customer1.setFirstname("Gerd");
		
		//Generation of an object called customer2, 
		//which is an instance of the class Customer
		Customer customer2 = new Customer();
		
		//Invocation of the setter methods
		//on the object customer2 
		customer2.setLastname("Cook");
		customer2.setFirstname("Franz");
		
		//Output of the values in the console
		System.out.println(customer1.getLastname());
		
		//Invocation of the setter method
		//on the object customer1
		//changing the value of the attribute
		customer1.setLastname("Test execution");
		
		//Output of the values in the console
		System.out.println(customer1.getLastname());
		System.out.println(customer2.getLastname());

	}//end of main()-method

}//end of OnlineShop-class
