package products;

public class MusicProduct extends Product{
	
	//attributes
	private String performer;
	
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
				+ " performed by:" + this.performer;
	}
	
	
	//getters and setters
	public String getPerformer() {
		return performer;
	}

	public void setPerformer(String performer) {
		this.performer = performer;
	}


	@Override
	public String getTwitterDescription() {
		/*This block is needed when 
		 * an object of type Product is calling the method.
		 * Since the Parent does not have access to the attribute 'performer' ,
		 * which is specific for the Child class,
		 * we need to check if the 'performer' has been set.
		 * This allows us to have the polymorphism working without exceptions*/
		if(this.performer == null){
			return "MusicProduct : '" + this.title + "' by Unknown Performer";
		}else{
			return "MusicProduct : '" + this.title + "' performed by " + this.performer;
		}
		
	}//getTwitterDescription
		
	//return "MusicProduct : '" + this.title + "' performed by " + this.performer;
	/*Overriding
	 * The process of implementing an inherited method
	 * and changing the implementation
	 * or providing an implementation 
	 * is called overriding.*/
}//class
