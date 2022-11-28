package products;

public class Game extends Product{

	//attributes
	private Author author;

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
				+ " Author:" + this.author.getAuthorName();
	}
	
	//getters and setters
	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String getTwitterDescription() {
		/*This block is needed when 
		 * an object of type Product is calling the method.
		 * Since the Parent does not have access to the attribute 'author' ,
		 * which is specific for the Child class,
		 * we need to check if the 'author' has been set.
		 * This allows us to have the polymorphism working without exceptions*/
		if(this.author == null){
			return "Game : '" + this.title + "' by Unknown Author";
		}else{
			return "Game : '" + this.title + "' by " + this.author.getAuthorName();
		}		
	}//getTwitterDescription

	//return "Game : '" + this.title + "' by " + this.author.getAuthorName();
	/*Overriding
	 * The process of implementing an inherited method
	 * and changing the implementation
	 * or providing an implementation 
	 * is called overriding.*/
}//class
