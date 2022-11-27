package package01;

public class Customer {
	
	//attributes
	private String lastname;
	private String firstname;
	private String sex;
	private String birthdate;
	
	//getters and setters
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getSex() {
		return sex;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBirthdate() {
		return birthdate;
	}
	
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
		
	public static void main(String[] args) {
		
		Customer customer01 = new Customer();
		
		customer01.setBirthdate("12.12.2012"); 	
		
		String birthdate = customer01.getBirthdate();
			
		System.out.println("The birthdate is:" + birthdate);
		
		

	}//main
	
	
}//end of class




