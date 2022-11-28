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

	@Override
	public String getTwitterDescription() {
		/*This block is needed when 
		 * an object of type Product is calling the method.
		 * Since the Parent does not have access to the attribute 'director' ,
		 * which is specific for the Child class,
		 * we need to check if the 'director' has been set.
		 * This allows us to have the polymorphism working without exceptions*/
		if(this.director == null){
			return "Film : '" + this.title + "' by Unknown Director";
		}else{
			return "Film : '" + this.title + "' directed by " + this.director;
		}		
	}//getTwitterDescription
	
	//return "Film : '" + this.title + "' directed by " + this.director;
	/*Overriding
	 * The process of implementing an inherited method
	 * and changing the implementation
	 * or providing an implementation 
	 * is called overriding.*/
	
}//class
