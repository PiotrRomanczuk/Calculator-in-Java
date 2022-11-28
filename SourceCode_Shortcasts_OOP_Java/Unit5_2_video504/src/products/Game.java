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
		return this.productNumber + ":"
				+ this.manufacturer + ";"
				+ this.title 
				+ " Author:" + this.author.getAuthorName();
	}
	
	//getters and setters
	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	
}//class
