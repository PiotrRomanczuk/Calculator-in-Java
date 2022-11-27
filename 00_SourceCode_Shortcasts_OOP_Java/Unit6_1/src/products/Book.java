package products;

public class Book extends Product{
	/*The subclass Book inherits 
	 * from the superclass Product
	 * and defines additional attribute
	 * 
	 * The inheritance is implemented with the keyword "extends"
	 * The concept of inheritance is also called "extension".
	 * The subclass Book "extends" the superclass Product,
	 * because it defines one new attribute - author
	 * 
	 *  The inheritance starts from the derived class, 
	 *  from the child class,
	 *  exactly as the arrow in the UML class diagram
	 *  Therefore, the keyword "extends" is written here,
	 *  in the class Book
	 *  
	 *  All attributes and methods,
	 *  which have been declared with a visibility modifier
	 *  protected or public,
	 *  are now accessible inside the class Book
	 *  
	 *  Attributes with visibility modifier private
	 *  are accessible in the child class
	 *  only via the getters and the setters*/
	
	
	//attributes 
	private Author author;
	//additional attribute is defined here
	
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
		// TODO Auto-generated method stub
		return "Book : '" + this.title + "' by " + this.author.getAuthorName();
	}

	//return "Book : '" + this.title + "' by " + this.author.getAuthorName();
	/*Overriding
	 * The process of implementing an inherited method
	 * and changing the implementation
	 * or providing an implementation 
	 * is called overriding.*/

	
}//class
