package onlineShop;

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

		/*setting the attributes of the customer01
		 * This must be done for each attribute which the customer can enter*/
		customer01.setLastName("Lange");
		customer01.setFirstName("Gerd");
		customer01.setBirthdate("1967-10-23");
		customer01.setSex("M");
		
		System.out.println("Displaying the information for customer01");
		System.out.println("Last name=" + customer01.getLastName());
		System.out.println("First name=" + customer01.getFirstName());
		System.out.println("Birthdate=" + customer01.getBirthdate());
		System.out.println("Gender=" + customer01.getSex());
	
		System.out.println("#######################################################################################");
		
		/*The more attributes a class has, 
		 * the greater the programming time 
		 * and effort it requires.
		 * The size of the program will also grow,
		 * because we need one set-statement per attribute.
		 * This will create the risk that we miss some attribute 
		 * and forget to set it.
		 * Such event is undesired.
		 * 
		 * In such case would be a good idea to use the overloaded constructor.
		 * The overloaded constructor,
		 * taking list with the necessary parameters
		 * is implemented once,
		 * in the class which we want to instantiate.
		 * In our case this is the class Customer
		 * 
		 * If you did not pass a mandatory parameter 
		 * to the overloaded constructor,
		 * the error is visible immediately
		 * */
		
		String lName02 = "Doe";//
		String fName02 = "Jane";
		String birthdate02 = "1990-12-12";
		String s02 = "F";
		/*In the "real world" those values will come from the GUI,
		 * where the customer enters his/hers data
		 * */
		
		//invoking the overloaded constructor
		Customer customer02 = new Customer(lName02,fName02,birthdate02,s02);
		
		System.out.println("Displaying the information for customer02");
		System.out.println("Last name=" + customer02.getLastName());
		System.out.println("First name=" + customer02.getFirstName());
		System.out.println("Birthdate=" + customer02.getBirthdate());
		System.out.println("Gender=" + customer02.getSex());
		System.out.println("customer02.getMinimumOrderValue()=" + customer02.getMinimumOrderValue());

		System.out.println("#######################################################################################");
		
		/*Imagine the following use case:
		 * you are the shop owner, 
		 * and you need a small window in the program,
		 * where you can enter only the names of the customer,
		 * and execute a quick search in the database
		 * 
		 * For such a case you will need to create
		 * an object of type Customer,
		 * having only the name-attributes set.
		 * This means that you need another overloaded constructor, 
		 * which can create a Customer-object with only two parameters
		 * */
		String lName03 = "Doe";//
		String fName03 = "John";
		/*In the "real world" those values will come from the GUI,
		 * where you enter customer data for quick search
		 * */
		
		Customer customer03 = new Customer(lName03,fName03);
		/*Invoking another overloaded constructor.
		 * There can be more than one overloaded constructor
		 * */
		
		System.out.println("Displaying the information for customer03");
		System.out.println("Last name=" + customer03.getLastName());
		System.out.println("First name=" + customer03.getFirstName());
		System.out.println("Birthdate=" + customer03.getBirthdate());
		System.out.println("Gender=" + customer03.getSex());
		System.out.println("customer03.getMinimumOrderValue()=" + customer03.getMinimumOrderValue());
	
	}//main

}//class
