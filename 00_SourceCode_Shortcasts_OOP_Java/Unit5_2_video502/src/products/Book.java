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

	//getters and setters
	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
}//class
