package package01;

public class ShoppingCart02 {
	private float quantityProducts;
	private float productSum;
	private boolean couponsHonored;

	public static void main(String[] args) {
		System.out.println("Testing the conditional branching part two");
		Customer customer01 = new Customer();
		customer01.setPremiumCustomer(true);
		System.out.println("Is the customer a premium customer? ==>" + customer01.isPremiumCustomer());
		
		System.out.println("Creating the the shopping cart");
		ShoppingCart02 myShoppingCart = new ShoppingCart02();
		//Let's say the customer has spent 100 Euro in our shop
		myShoppingCart.productSum = 100.0f;
		
		//Let's say the customer has bought 4 products
		myShoppingCart.quantityProducts = 4;
		
		//The next line sets if myShoppingCart is 
		myShoppingCart.couponsHonored = false;
		
		float resultOfDiscountCalculation = myShoppingCart.calculateSum(customer01);
		System.out.println("The price after calculating the discount is:" + resultOfDiscountCalculation + " Euro");

	}//main
	
	public float calculateSum(Customer customer){
		//Initially the price which the customer has to pay is 100 Euro
		float result = productSum;
		
		//Now we have to check if the customer is a premium customer
		if(customer.isPremiumCustomer() == true){
			//if the customer is a premium customer, 
			//a discount will be applied to the price 
			
			//Now we have to determine what is the discount
			if(quantityProducts > 3){
				//for more than 3 products the discount is 12%
				result = productSum * 0.88f;
			}else{
				//for less than 3 products the discount is 10%
				result = productSum * 0.9f;
			}
			
		}else{
			//if the customer is a NOT premium customer, 
			//we have to check if the discount for the coupon can be applied
			if(couponsHonored == true){
				//if the customer is honored with a coupon, 
				//a discount of 5% is calculated
				result = productSum * 0.95f;
			}
			
		}//end of the outer if-else-branching
		
		//At the and the result of the calculation
		//is returned to the calling program
		return result;
	}//calculateSum
	
}//class
