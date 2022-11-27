package onlineShop.products;

public class Product {
	/*Visibility modifiers*/
	
	//public ==> visible to all classes in the program
	public String title;
	
	//protected visible in the same package and in child classes
	//If you want to access it outside of this package,
	//you need getter and setter
	protected String manufacturer;
	
	

	//private ==> visible only inside the same class
	//for this one you need getter and setter
	private int productNumber;
	
	public int getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(int productNumber) {
		this.productNumber = productNumber;
	}
}
