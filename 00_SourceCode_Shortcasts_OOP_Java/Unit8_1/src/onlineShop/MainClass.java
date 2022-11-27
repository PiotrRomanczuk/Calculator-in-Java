package onlineShop;

import onlineShop.processing.ShoppingCart;
import onlineShop.users.Customer;

public class MainClass {

	public static void main(String[] args) {

		//Declaring some values 
		//for the attributes of the customer
		String lName01 = "Lange";
		String fName01 = "Gerd";
		String birthdate01 = "1967-10-23";
		String s01 = "M";
		
		Customer customer01 = new Customer(lName01,fName01,birthdate01,s01);
		
		System.out.println("Displaying the information for customer01");
		System.out.println("Last name=" + customer01.getLastName());
		System.out.println("First name=" + customer01.getFirstName());
		System.out.println("Birthdate=" + customer01.getBirthdate());
		System.out.println("Gender=" + customer01.getSex());
		System.out.println("customer01.getMinimumOrderValue()=" + customer01.getMinimumOrderValue());
		
		System.out.println("################################################################################################");
		
		//Setting some meaningful values for the ShoppingCart 
		ShoppingCart shoppingCart01 = new ShoppingCart();
		shoppingCart01.setQuantityProducts(5);
		shoppingCart01.setProductSum(25);
		customer01.setShoppingCart(shoppingCart01);
		
		System.out.println("The customer01 has bought " + customer01.getShoppingCart().getQuantityProducts() + " products");
		System.out.println("The sum of the products for customer01 is:" + customer01.getShoppingCart().getProductSum());
		
		//Trying to get the average price per product
		double averagePricePerProduct = customer01.getShoppingCart().pricePerProduct();
		System.out.println("averagePricePerProduct=" + averagePricePerProduct);
		if(averagePricePerProduct == -1){
			System.out.println("Invalid price per product");
		}else{
			System.out.println("The price per product is:" + averagePricePerProduct);
		}
		
	
	}//main

}//class
