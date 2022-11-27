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
		if(this.quantityProducts > 0){
			double averagePricePerProduct = this.productSum / this.quantityProducts ;
			return averagePricePerProduct;
		}else{
			return -1.0;
		}
		/*The down side of this approach is that
		 * the method has only one return value.
		 * This value has the main purpose to return 
		 * a meaningful domain value (price per product)
		 * to the calling program.
		 * 
		 * But this return value is also used for returning
		 * an error signal
		 * 
		 * This mixture of technical signals and domain values 
		 * can result in poor software quality 
		 * and should be avoided for that reason.
		 * 
		 * In order to write robust programs,
		 * a separate channel for error signals is needed.
		 * 
		 * This will result in decoupling 
		 * the domain value 
		 * and the error signal.
		 * 
		 * Additionally it is desired, 
		 * that the calling program 
		 * can "catch" all possible exceptions 
		 * coming via the error signal.
		 * */
	}//pricePerProduct
	
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
