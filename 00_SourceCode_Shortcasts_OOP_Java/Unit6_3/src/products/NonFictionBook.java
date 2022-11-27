package products;

public class NonFictionBook extends Book{
	
	//attributes
	private String subject;
	
	//methods
	//methods
	public String getDescription(){
		/*This method is overridden 
		 * This means:
		 *  -there is method with the same signature in the parent class
		 *  -but we need some different functionality here
		 *  -so we just use the same signature
		 *  -and implement the functionality which we want*/
		
		/*Creating the String which will be returned
		 * by calling the method super.getDescription()
		 * from the parent class*/
		String descriptionFromTheParentClass = super.getDescription();
		return descriptionFromTheParentClass + Product.SEPARATOR
				+ " Subject" + this.subject;
	}
	
	//getters and setters
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	

}
