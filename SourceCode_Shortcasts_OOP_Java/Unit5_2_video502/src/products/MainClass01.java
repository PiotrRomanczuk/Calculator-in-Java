package products;

public class MainClass01 {

	public static void main(String[] args) {
		/*Creating an object of type Author,
		 * and setting the appropriate value*/
		Author myAuthor = new Author();
		myAuthor.setAuthorName("Adam Author");
		
		//Creating an object of type Book
		Book myBook = new Book();
		
		/*Setting the attribute author,
		 * by invoking the instance method*/
		myBook.setAuthor(myAuthor);
		
		/*Setting the attributes
		 * productNumber 
		 * title
		 * manufacturer,
		 * by invoking the inherited methods*/
		myBook.setProductNumber("ABC123");
		myBook.setTitle("Book, Books, Buchner");
		myBook.setManufacturer("P Publisher");
		
		/*Getting the description of myBook,
		 * by invoking the inherited method .getDescription()
		 * */
		String myBook_Desription = myBook.getDescription();
		
		System.out.println("Printing the description of myBook");
		System.out.println(myBook_Desription);

	}//main

}//class
