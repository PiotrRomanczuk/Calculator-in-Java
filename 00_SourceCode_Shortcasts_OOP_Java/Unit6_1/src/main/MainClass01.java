package main;

import products.Author;
import products.Book;
import products.NonFictionBook;
import products.Product;

public class MainClass01 {

	public static void main(String[] args) {

		/*Creating an object of type Author,
		 * and setting the appropriate value*/
		Author author01 = new Author();
		author01.setAuthorName("Author 01");
		
		//Product product01 = new Product();
		//Cannot instantiate the type Product 
		
		Product product02 = new Book();
		//no problem with this one
		
		//##################################################################
		
		/*Creating an object of type Book
		 * and setting some appropriate values
		 * */
		Book myBook01 = new Book();
		myBook01.setAuthor(author01);
		myBook01.setProductNumber("ABC111");
		myBook01.setTitle("Book 01");
		myBook01.setManufacturer("Publisher 01");
		
		/*Getting the Twitter description of myBook,
		 * by invoking the (concrete) overridden method .getTwitterDescription()
		 * */
		String myBook_Desription = myBook01.getTwitterDescription();
		
		System.out.println("Printing the Twitter description of myBook01 by invoking the overridden method, \n which is inherited from the abstract parent class");
		System.out.println(myBook_Desription);
		

		
	}//main
}//class
