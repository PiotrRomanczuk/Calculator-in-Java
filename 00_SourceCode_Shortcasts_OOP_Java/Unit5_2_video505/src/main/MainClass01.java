package main;

import products.Author;
import products.Book;
import products.NonFictionBook;

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
		
		System.out.println("Printing the description of myBook01 by invoking the overridden method");
		System.out.println(myBook_Desription);
		
		System.out.println("####################################################################");
		
		/*Creating an object of type Author,
		 * and setting the appropriate value*/
		Author author02 = new Author();
		author02.setAuthorName("Author 02");
		
		/*Creating an object of type NonFictionBook
		 * and setting some appropriate values
		 * */
		NonFictionBook myNonFictionBook01 = new NonFictionBook();
		myNonFictionBook01.setAuthor(author02);
		myNonFictionBook01.setProductNumber(" XYZ 888");
		myNonFictionBook01.setTitle("Non-fiction Book 01");
		myNonFictionBook01.setManufacturer("Publisher 01111");
		myNonFictionBook01.setSubject("Biography");
		
		/*Getting the description of myBook,
		 * by invoking the overridden method .getDescription()
		 * */
		String myNonFictionBook01_Desription = myNonFictionBook01.getDescription();
		
		System.out.println("Printing the description of myNonFictionBook01 by invoking the overridden method");
		System.out.println(myNonFictionBook01_Desription);
		
	}//main
}//class
