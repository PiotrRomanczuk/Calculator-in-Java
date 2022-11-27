package onlineShop.processing;

public class ShoppingCart {
	//attributes
	private int quantityProducts;
	private double productSum;//previous name was 'orderValue'
	
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
		this.productSum = originalShoppingCart.productSum;
	}
	
	//methods
	public double pricePerProduct(){
		/*This method will return the average price per product
		 * for this ShoppingCart*/
		
		/*The code block below uses 
		 * the first way for handling exceptions:
		 * 1.�Catch� the exception 
		 * within the method where it is �thrown�
		 * */
		double averagePricePerProduct;
	
		try{
			/*If you divide by 0.0, the result will be INFINITY
			 * 
			 * Java will not throw an exception 
			 * if you divide by float/double zero. 
			 * It will detect a run-time error only 
			 * if you divide by integer zero not double zero.
			 * 
			 * Therefore we need to type-cast the operands for the division
			 * to be from type int 
			 * In simple words it means:
			 * "Please treat those numbers as integers"
			 * */
			averagePricePerProduct = (int)this.productSum / (int)this.quantityProducts ;		
		}catch(ArithmeticException ex){
			/*If there is a division by zero, 
			 * or something else goes wrong with the arithmetics,
			 * the averagePricePerProduct is set to a meaningful valid value
			 * */
			System.out.println("EXCEPTION in ShoppingCart.pricePerProduct !!!");
			System.out.println("An Exception during the calculation of pricePerProduct has occurred!! ");
			//averagePricePerProduct = 0;
			
			/*The code block below uses 
			 * the third way for handling exceptions:
			 * 3.�Catch� it within the method where it is �thrown�,
			 *  then pass it back to the calling method with a specific message*/
			throw new ArithmeticException("Calculation not possible: Shopping cart is empty!!");
		}
		return averagePricePerProduct;
	
	}//pricePerProduct
	
//	public double pricePerProduct() throws ArithmeticException{
//		/*This method will return the average price per product
//		 * for this ShoppingCart*/
//		
//		/*The code block below uses 
//		 * the second way for handling exceptions:
//		 * 2.Pass the Exception back to calling method
//		 * */
//		double averagePricePerProduct = (int)this.productSum / (int)this.quantityProducts;
//		/*If you divide by 0.0, the result will be INFINITY
//		 * 
//		 * Java will not throw an exception 
//		 * if you divide by float zero. 
//		 * It will detect a run-time error only 
//		 * if you divide by integer zero not double zero.
//		 * 
//		 * Therefore we need to type-cast the operands for the division
//		 * to be from type int 
//		 * In simple words it means:
//		 * "Please treat those numbers as integers"
//		 * (int)this.productSum / (int)this.quantityProducts
//		 * */
//		
//		return averagePricePerProduct;
//
//	}//pricePerProduct
	
	//getters and setters
	public int getQuantityProducts() {
		return quantityProducts;
	}

	public void setQuantityProducts(int quantityProducts) {
		this.quantityProducts = quantityProducts;
	}

	public double getProductSum() {
		return productSum;
	}

	public void setProductSum(double productSum) {
		this.productSum = productSum;
	}
}//class
