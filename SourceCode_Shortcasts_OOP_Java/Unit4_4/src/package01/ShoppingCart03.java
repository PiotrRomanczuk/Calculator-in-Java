package package01;

public class ShoppingCart03 {
	private float quantityProducts;
	private float productSum;
	private boolean couponsHonored;

	public static void main(String[] args) {
		System.out.println("Testing the conditional branching part three");
		
		/*Although for an age of 28 years both the 1st and
		 * the 2nd condition are met, 
		 * only the statement for the 1st condition is executed.*/
		checkAgeRating(28);
	}//main
	
	public static void checkAgeRating(int ageOfCustomer){
		/*Expanded if-else branch
		 * not just one condition is tested before the else-branch,
		 * but multiple, mutually exclusive conditions*/
		if(ageOfCustomer >= 18){
			System.out.println("Customer is full age");
		}else if(ageOfCustomer >= 16){// If the ageOfCustomer is smaller than 18,
									  // this if-branch will be checked
			System.out.println("Customer is not full age, but older than 16");
		}else{//If the ageOfCustomer is smaller than 16, 
			  //the execution continues in the else-branch 
			System.out.println("Customer is younger than 16");
		}
		
	}//checkAgeRating

}
