package main;

import java.util.ArrayList;

import products.Author;
import products.Book;
import products.Film;
import products.Game;
import products.MusicProduct;
import products.NonFictionBook;
import products.Product;

public class MainClass01 {

	public static void main(String[] args) {

		/*Creating an object of type Author,
		 * and setting the appropriate value*/
		Author author01 = new Author();
		author01.setAuthorName("Author 01");
		
		/*Creating an object of type Product
		 * by using the constructor of the child class Book
		 * and setting some appropriate values
		 * */
		Product product01 = new Book();
		product01.setProductNumber("ABC111");
		product01.setTitle("Book 01");
		product01.setManufacturer("Publisher 01");
	
		/*The methods and the attributes which only the Child has,
		 * are not accessibly for the Parent*/
		//product01.setAuthor(author01);
		
		
		/*Creating an object of type Product 
		 * by using the constructor of the child class Film
		 * and setting some appropriate values
		 * */
		Product product02 = new Film();	
		product02.setProductNumber("ABC444");
		product02.setTitle("Film 04");
		product02.setManufacturer("Film publisher 04");
		
		/*The methods and the attributes which only the Child has,
		 * are not accessibly for the Parent*/
		//product02.setDirector("Director 04");
		
		/*Creating an object of type Author,
		 * and setting the appropriate value*/
		Author author02 = new Author();
		author02.setAuthorName("Author 02");
		
		/*Creating an object of type Product
		 * by using the constructor of the child class Game
		 * and setting some appropriate values
		 * */
		Product product03 = new Game();
		product03.setProductNumber("ABC222");
		product03.setTitle("Game 02");
		product03.setManufacturer("Game publisher 02");
		
		/*The methods and the attributes which only the Child has,
		 * are not accessibly for the Parent*/
		//product03.setAuthor(author02);
		
		/*Creating an object of type Product
		 * by using the constructor of the child class MusciProduct
		 * and setting some appropriate values
		 * */
		Product product04 = new MusicProduct();
		product04.setProductNumber("ABC333");
		product04.setTitle("Music Product 03");
		product04.setManufacturer("Music publisher 03");	
		
		/*The methods and the attributes which only the Child has,
		 * are not accessibly for the Parent*/
		//product04.setPerformer("Performer 01");
		
		//This list will contain the products
		ArrayList<Product> productList = new ArrayList<Product>();
		
		//Adding all the products in the list:
		productList.add(product01);
		productList.add(product02);
		productList.add(product03);
		productList.add(product04);
		
		/*All those objects can be added to the same list,
		 * despite being instantiated with  different constructors
		 *  This is because all of the classes,
		 *  from which we used the constructors,
		 *  inherit from the same class -Product
		 * */
		
		/*Therefore, we can go through the productList
		 * without any problem,
		 * because all objects in the list
		 * can be referred to 
		 * as instances class Product,
		 * despite using different constructors to create them*/
		for(Product currentProduct : productList){
			
			/*Each one of the child classes has a method getTwitterDescription()
			 * The choice of implementation is done at runtime,
			 * i.e. exactly which method to call is decided at runtime,
			 * depending on the child class 
			 * whose constructor was used to instantiate the Product
			 * ==> this is called  POLYMORPHISM --taking many forms*/
			String currentProductDescription = currentProduct.getTwitterDescription();
			System.out.println("Twitter description of currentProduct:" + currentProductDescription);
		}
		
		//####################################################################################################
		
		System.out.println("##################################################################################");
		
		for(Product currentProduct : productList){
			System.out.println("------------------------------------------------------------------------------");
			if(currentProduct instanceof Book){
				System.out.println("Now printing the twitter description of a Book");
			}
			
			if(currentProduct instanceof Film){
				System.out.println("Now printing the twitter description of a Film");
			}
			
			if(currentProduct instanceof Game){
				System.out.println("Now printing the twitter description of a Game");
			}
			
			if(currentProduct instanceof MusicProduct){
				System.out.println("Now printing the twitter description of a MusicProduct");
			}
			
			String currentProductDescription = currentProduct.getTwitterDescription();
			System.out.println("Twitter description of currentProduct:" + currentProductDescription);
		}//for
		
		
	}//main
}//class
