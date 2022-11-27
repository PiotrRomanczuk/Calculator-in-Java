package package01;

public class ShoppingCart01 {
	private float quantityProducts;
	private float productSum;
	private boolean couponsHonored;

	public static void main(String[] args) {
		/*Control structures
		 * Conditional branching with if-else
		 * */
		System.out.println("Testing the conditional branching basic demo");
		int a = 3;
		int b = 5;
		if( a == b){
			System.out.println("The numbers are equal");
		}else{
			System.out.println("The numbers are NOT equal");
		}
		
		System.out.println("#####################################################################");
		
		
		System.out.println("Testing the conditional branching part one");
		System.out.println("Creating the customer and assigning values to the attributes");
		Customer customer01 = new Customer();
		customer01.setPremiumCustomer(true);
		System.out.println("Is the customer a premium customer? ==>" + customer01.isPremiumCustomer());
		
		System.out.println("Creating the the shopping cart");
		ShoppingCart01 myShoppingCart = new ShoppingCart01();
		//Let's say the customer has spent 100 Euro in our shop
		myShoppingCart.productSum = 100.0f;
		
		//Now we call the method for re-calculating the productSum, by checking if the customer is a premium customer
		float resultOfDiscountCalculation = myShoppingCart.calculateSum(customer01);
		System.out.println("The price after calculating the discount is:" + resultOfDiscountCalculation + " Euro");
		
	}//main
	
	public float calculateSum(Customer customer){	
		//Initially the price which the customer has to pay is 100 Euro
		float result = productSum;
		
		//Now we have to check if the customer is a premium customer
		if(customer.isPremiumCustomer() == true){
			//if the customer is a premium customer, 
			//a 10% discount will be applied to the price 
			result = productSum * 0.9f;
		}else{
			//if the customer is a NOT premium customer, 
			//the full price must be paid
			result = productSum * 1.0f;
		}
		
		//At the and the result of the calculation 
		//is returned to the calling program
		return result;
	}//calculateSum

}//class
