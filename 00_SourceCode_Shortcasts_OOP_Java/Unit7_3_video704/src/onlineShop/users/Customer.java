package onlineShop.users;

import onlineShop.processing.ShoppingCart;

public class Customer {
	//attributes
	private String lastName;
	private String firstName;
	private String birthdate;
	private String sex;
	protected double minimumOrderValue;
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
	
	//Overloaded constructors
	
	public Customer(String lastName, String firstName, String birthdate,  String sex){
		/*This overloaded constructor needs all 4 parameters
		 * If you try to call it with wrong number of parameters, 
		 * you will get an error
		 * 
		 * With this constructor you can instantiate an object,
		 * and immediately set the values, during instantiation
		 * 
		 * In this way the setting of the values for the attributes 
		 * is done only here*/
		this(lastName,firstName);
//		this.lastName = lastName;
//		this.firstName = firstName;
		this.birthdate = birthdate;
		this.sex = sex;
		
		/*What should we do with the other two attributes?
		 * Maybe we should set them as well?
		 * */
//		this.shoppingCart = new ShoppingCart();
//		this.minimumOrderValue = 10.0;
		/*Why do we need to write this code twice?
		 * Can we do this better?
		 * ==> YES, we can. Constructors can invoke each other*/
		
		/*It makes sense for constructors to invoke each other,
		 * in order to avoid double code
		 * and to improve serviceability/maintainability 
		 * this(lastName,firstName)*/
	}
	
	/*Maybe for some reason your program needs a constructor
	 * which only sets the names of the Customer.
	 * For example if you are implementing a "quick search" window
	 * In this case you can create a Customer object by only setting the names.
	 * For this purpose you can add another constructor
	 * */
	public Customer(String lastName, String firstName){
		/*This is another overloaded constructor.
		 * As long as the list of parameters is different,
		 * you can include another constructor in your program*/
		
		
		this();
		/*in this way you don't need to add the setting 
		 * this.shoppingCart = new ShoppingCart();
		 * this.minimumOrderValue = 10.0;*/
		this.lastName = lastName;
		this.firstName = firstName;	
		
	}
	
	//copy constructor
	public Customer(Customer originalCustomer){
		/*If you need a copy of a customer,
		 * for example for archiving it in some backup database,
		 * you can create another Customer-object,
		 * identical to the original Customer-object,
		 * by using the the copy-constructor
		 * 
		 * In this constructor every single one of the attributes
		 * of the object which was passed as a parameter
		 * must be assigned to the attributes of the copy
		 * */
		this.lastName = originalCustomer.lastName;
		this.firstName = originalCustomer.firstName;
		this.birthdate = originalCustomer.birthdate;
		this.sex = originalCustomer.sex;
		this.minimumOrderValue = originalCustomer.minimumOrderValue;
		//this.shoppingCart = originalCustomer.shoppingCart;
		this.shoppingCart = new ShoppingCart(originalCustomer.shoppingCart);
		
		/* this.shoppingCart = originalCustomer.shoppingCart ==> shallow copy
		 * 
		 * this.shoppingCart = new ShoppingCart(originalCustomer.shoppingCart); ==> deep copy
		 * 
		 * If you want to achieve a real deep copy,
		 * then in the copy-constructor for a class,
		 * when you are copying a Reference data type,
		 * you have to use the copy-constructor of this Reference Data type
		 * */
		
	}//copy constructor
	
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
