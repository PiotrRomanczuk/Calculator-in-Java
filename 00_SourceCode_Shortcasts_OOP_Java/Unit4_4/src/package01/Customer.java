package package01;

public class Customer {
	/*This class is implemented following the class diagram on page 69 from the course book*/
	
	//attributes
	private String firstName;
	private String lastName;
	private String sex;
	private boolean isPremiumCustomer;

	//getters and setters
	public boolean isPremiumCustomer() {
		return isPremiumCustomer;
	}

	public void setPremiumCustomer(boolean isPremiumCustomer) {
		this.isPremiumCustomer = isPremiumCustomer;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

}//class
