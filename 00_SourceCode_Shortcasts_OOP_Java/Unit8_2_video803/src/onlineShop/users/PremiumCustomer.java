package onlineShop.users;

public class PremiumCustomer extends Customer {
	//attributes specific for the premium customers
	private double movBonus = 10;
	
	public PremiumCustomer(String lastName, String firstName){
		/*If you have classes which are connected with inheritance,
		 * i.e. one of them is Parent 
		 * and the other one is Child,
		 * you can use the constructor of the Parent
		 * inside the constructor of the Child
		 * by using the keyword 'super'
		 * */
		super(lastName,firstName);//invoking the constructor of the super-class
		
		/*After that you can perform the actions
		 * which are specific for the Child-class*/
		this.minimumOrderValue = this.minimumOrderValue - movBonus;
	}
	
}//class
