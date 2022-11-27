package main;

import products.Author;
import products.Book;

public class MainClass01 {

	public static void main(String[] args) {
		/*Overriding
		 * The process of implementing an inherited method
		 * and changing the implementation 
		 * is called overriding.*/
		
			
		
		/*Creating an object of type Author,
		 * and setting the appropriate value*/
		Author author01 = new Author();
		author01.setAuthorName("Author 01");
		
		/*Creating an object of type Book
		 * and setting some appropriate values
		 * */
		Book myBook01 = new Book();
		myBook01.setAuthor(author01);
		myBook01.setProductNumber("ABC111");
		myBook01.setTitle("Book 01");
		myBook01.setManufacturer("Publisher 01");
		
		/*Getting the description of myBook,
		 * by invoking the overridden method .getDescription()
		 * */
		String myBook_Desription = myBook01.getDescription();
		
		System.out.println("Printing the description of myBook01");
		System.out.println(myBook_Desription);
	}//main
}//class
