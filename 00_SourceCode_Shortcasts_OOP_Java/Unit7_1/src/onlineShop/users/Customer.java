package onlineShop.users;

import onlineShop.processing.ShoppingCart;

public class Customer {
	//attributes
	private String lastName;
	private String firstName;
	private String birthdate;
	private String sex;
	private double minimumOrderValue;
	private ShoppingCart shoppingCart;
	
	//standard constructor
	public Customer(){
		/*The standard constructor is a special kind of method 
		 * which can exist only once for a class
		 * 
		 * Requirements for the standard constructor:
		 * 1.Visibility modifier public
		 * 2.No return type
		 * 3.No parameters
		 * 4.Name must be exactly the same as the class name
		 * 
		 * Tasks of the standard constructor:
		 * 1.Setting the default values for primitive data types
		 * 2.Creating the non-primitive attributes (objects)
		 * */
		this.shoppingCart = new ShoppingCart();
		this.minimumOrderValue = 10.0;
		/*If the logic of your program does not require you to perform those two tasks,
		 * you can leave the standard constructor empty, this is completely fine
		 * */
	}//standard constructor

	//getters and setters
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getBirthdate() {
		return birthdate;
	}
	
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	
	public String getSex() {
		return sex;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public double getMinimumOrderValue() {
		return minimumOrderValue;
	}

	public void setMinimumOrderValue(double minimumOrderValue) {
		this.minimumOrderValue = minimumOrderValue;
	}

	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}

	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
	
}//class
