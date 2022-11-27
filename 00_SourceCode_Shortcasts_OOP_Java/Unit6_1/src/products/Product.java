package products;

public abstract class Product {
	/*This class is an abstract class.
	 * Which means that no objects 
	 * can be instantiated from this class
	 * The class serves for design purposes 
	 * and for better structure of the program
	 * 
	 * This is the base class (superclass)
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
	
	/*This method is an abstract method
	 * The method has a signature,
	 * but no implementation
	 * Abstract methods cannot define method bodies!
	 * 
	 * If a class has abstract method,
	 * the class must be declared as an abstract class
	 * 
	 * The method getTwitterDescription()
	 * must be implemented in the subclasses, 
	 * which are concrete classes,
	 * by using @Override
	 * 
	 * The implementation of an inherited abstract method
	 *  in a subclass is forced by the compiler*/
	public abstract String getTwitterDescription();
	/*Overriding
	 * The process of implementing an inherited method
	 * and changing the implementation
	 * or providing an implementation 
	 * is called overriding.*/
	
	//concrete method 
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
