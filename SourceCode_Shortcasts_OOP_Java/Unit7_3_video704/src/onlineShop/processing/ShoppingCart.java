package onlineShop.processing;

public class ShoppingCart {
	//attributes
	private double orderValue;
	
	/*You can also leave out completely
	 * the definition of the standard constructor.
	 * In this case an empty standard constructor is
	 * implicitly added by the Java compiler.
	 * Even if you don't see such a constructor here in the source code, 
	 * it can still be invoked with the new-operator
	 * and it will create an object -instance of this class
	 * */
	public ShoppingCart() {} //This is the standard constructor
	
	//copy constructor
	public ShoppingCart(ShoppingCart originalShoppingCart){
		/*Without this constructor 
		 * if you are copying a Customer-object, 
		 * you will get a shallow copy
		 * 
		 * With this constructor
		 * if you are copying a Customer-object,
		 * you will get a deep copy*/
		this.orderValue = originalShoppingCart.orderValue;
	}

	//getters and setters
	public double getOrderValue() {
		return orderValue;
	}

	public void setOrderValue(double orderValue) {
		this.orderValue = orderValue;
	}
	
}//class
