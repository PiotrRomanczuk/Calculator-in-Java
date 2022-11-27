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
	
	//Declaring of a static attribute
	public static String SEPARATOR = ";";
	public static String VALID_PRODUCT_NUMBER_START = "ABC";
	/*Not bound to an object, 
	 * i.e. no need to instantiate an object in order to access them
	 * They are the same for all instances of the class
	 * Can be addressed/accessed through the class name 
	 * When the value of a static attribute is changed,
	 * then it changes for all the objects of the class and the subclasses*/
	
	//attributes
	protected String manufacturer;
	protected String title;
	protected String productNumber;
	
	//methods
	
	/*Methods can also be static
	 * This means again -no need to instantiate an object,
	 * in order to access this method
	 * Static methods are invoked through the class
	 * */
	public static boolean isProductNumberValid(String productNumber){
		/*Static methods can be invoked without the existence of an object.
		 * Therefore inside the body of this method you cannot access
		 * any attribute or a method which is NOT static*/
		//String manu = manufacturer;
		
		if(productNumber.startsWith(Product.VALID_PRODUCT_NUMBER_START)){
			return true;
		}else{
			return false;
		}
	}//isProductNumberValid
	
	
	
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
		return this.productNumber + Product.SEPARATOR
				+ this.manufacturer + Product.SEPARATOR
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
