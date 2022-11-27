package products;

public class Product {
	/*This is the base class (superclass)
	 * called Product
	 * All products will inherit 
	 * from this class,
	 * which means that all those attributes,
	 * which are declared here inside this class,
	 * will be available also in all child classes
	 * */
	
	
	//attributes
	protected String manufacturer;
	protected String title;
	protected String productNumber;
	
	//methods
	public String getDescription(){
		return this.productNumber + ":"
				+ this.manufacturer + ";"
				+ this.title;
	}
	
	//getters and setters
	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(String productNumber) {
		this.productNumber = productNumber;
	}
	
}//class
