package products;

public class Film extends Product{
	
	//attributes
	private String director;
	
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
		return descriptionFromTheParentClass + ";"
				+ " directed by" + this.director;
	}
	
	//getters and setters
	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
		
}//class
