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

		System.out.println("Testing the static attribute of the class Product");
		System.out.println("Product.SEPARATOR=" + Product.SEPARATOR);
		
		
		System.out.println("#########################################################################");
			
		/*Creating an object of type Author,
		 * and setting the appropriate value*/
		Author author01 = new Author();
		author01.setAuthorName("Author 01");
		
		/*Creating an object of type Book
		 * and setting some appropriate values
		 * */
		Book book01 = new Book();
		book01.setAuthor(author01);
		book01.setProductNumber("ABC111");
		book01.setTitle("Book 01");
		book01.setManufacturer("Publisher 01");
		
		/*Creating an object of type Author,
		 * and setting the appropriate value*/
		Author author02 = new Author();
		author02.setAuthorName("Author 02");
		
		/*Creating an object of type Game
		 * and setting some appropriate values
		 * */
		Game game01 = new Game();
		game01.setAuthor(author02);
		game01.setProductNumber("ABC222");
		game01.setTitle("Game 02");
		game01.setManufacturer("Game publisher 02");
		
		/*Creating an object of type MusicProduct
		 * and setting some appropriate values
		 * */
		MusicProduct musicProduct01 = new MusicProduct();
		musicProduct01.setPerformer("Performer 01");
		musicProduct01.setProductNumber("ABC333");
		musicProduct01.setTitle("Music Product 03");
		musicProduct01.setManufacturer("Music publisher 03");
		
		/*Creating an object of type Film
		 * and setting some appropriate values
		 * */
		Film film01 = new Film();
		film01.setDirector("Director 04");
		film01.setProductNumber("ABC444");
		film01.setTitle("Film 04");
		film01.setManufacturer("Film publisher 04");
		
		//This list will contain the products
		ArrayList<Product> productList = new ArrayList<Product>();
		
		//Adding all the products in the list:
		productList.add(book01);
		productList.add(game01);
		productList.add(musicProduct01);
		productList.add(film01);
		/*All those objects can be added to the same list,
		 * despite being from different types(classes)
		 * This is because all of the classes inherit from the same class -Product
		 * */
		
		/*In the same way we can go through the productList
		 * without any problem,
		 * because all objects in the list
		 * are "children" of the class Product*/
		for(Product currentProduct : productList){
			String currentProductDescription = currentProduct.getDescription();
			System.out.println("Description of currentProduct:" + currentProductDescription);
		}
			
		System.out.println("#########################################################################");
		
		for(Product currentProduct : productList){
			String productNumberOfCurrentProduct = currentProduct.getProductNumber();
			
			/*Using static the method Product.isProductNumberValid()
			 * ==> no need to instantiate an object of type Product,
			 * we can just call the method
			 * -this is the usage of static method
			 *  */
			boolean hasCurrentProductAValidProductNumber = Product.isProductNumberValid(productNumberOfCurrentProduct);
			System.out.println("hasCurrentProductAValidProductNumber:" + hasCurrentProductAValidProductNumber);
		}
		
	}//main
}//class
