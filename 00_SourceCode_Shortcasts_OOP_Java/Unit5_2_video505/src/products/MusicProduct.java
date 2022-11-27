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
		return descriptionFromTheParentClass + ";"
				+ " performed by:" + this.performer;
	}
	
	
	//getters and setters
	public String getPerformer() {
		return performer;
	}

	public void setPerformer(String performer) {
		this.performer = performer;
	}
		
}//class
