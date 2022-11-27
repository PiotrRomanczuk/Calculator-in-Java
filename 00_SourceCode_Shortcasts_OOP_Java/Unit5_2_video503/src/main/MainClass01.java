package main;

import products.Author;
import products.Book;
import products.Product;

public class MainClass01 {

	public static void main(String[] args) {
		//Declaring an object of type Product
		Product myBook01;
		
		/*Assignment of an entity
		 *from the subclass Book 
		 *is permitted
		 *
		 *Because every Book is a Product
		 *This is called assignment compatibility
		 **/
		myBook01 = new Book();
		System.out.println("Every Book is a Product");
		System.out.println("Therefore we can call the default constructor of the class Book for an object of type Product");
		
		System.out.println("############################################################################");
		
		//Declaring an object of type Book
		Book myBook02;
		
		/*Assignment of an entity
		 *from the superclass Product 
		 *is NOT permitted
		 *
		 *Because NOT every Product is a Book
		 **/
		//myBook02 = new Product();
		System.out.println("Not every Product is a Book");
		System.out.println("Therefore we CAN NOT call the default constructor of the class Product for an object of type Book");
		
		System.out.println("############################################################################");
		
		/*The type of a variable decides which attributes and methods can be invoked
		 * If an object is of type Product (the parent class),
		 * the attributes and methods from the class Book(child class)
		 * are not accessible for this object*/
		
		/*Creating an object of type Product,
		 * and calling the default constructor*/
		Product myProduct01;
		myProduct01 = new Product();
		

		/*Setting the attributes
		 * productNumber 
		 * title
		 * manufacturer,
		 * by invoking the instance methods*/
		myProduct01.setProductNumber("ABC123");
		myProduct01.setTitle("Book, Books, Buchner");
		myProduct01.setManufacturer("P Publisher");
		
		/*Getting the description of myProduct01,
		 * by invoking the inherited method .getDescription()
		 * */
		String productDescription = myProduct01.getDescription();
		
		System.out.println("Printing the description of myProduct01");
		System.out.println(productDescription);
		
		/*Trying to use the method .setAuthor
		 * from the child class Book*/
		//myProduct01.setAuthor();
		System.out.println("Accessing the methods and attributes of a child class,");
		System.out.println("from the parent class");
		System.out.println("is NOT possible");

	}//main

}//class
