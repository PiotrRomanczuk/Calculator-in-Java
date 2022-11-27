package onlineShop.administration;

import onlineShop.interfaces.ICustomerStorage;
import onlineShop.storage.BackupToCloudStorage;
import onlineShop.storage.DBCustomerStorage;
import onlineShop.storage.LocalStorage;
import onlineShop.users.Customer;

public class CustomerAdministration {
	
	//attributes
	private Customer k1;
	private Customer k2;
	private ICustomerStorage customerStorage;
	
	//methods
	public void updateAllCustomers(){
		this.customerStorage.update(k1);
		this.customerStorage.update(k2);
	}
	
	
	public static void main(String[] args) {
		/*Creating a new object for the customer administration*/
		CustomerAdministration myAdministration = new CustomerAdministration();
		
		/*Creating objects for the storage place*/
		ICustomerStorage dbStorage = new DBCustomerStorage();
		ICustomerStorage localStorage = new LocalStorage();
		ICustomerStorage backupToCloudStorage = new BackupToCloudStorage();
		
		/*Setting the desired storage place*/
		//myAdministration.customerStorage = dbStorage;
		//myAdministration.customerStorage = localStorage;
		myAdministration.customerStorage = backupToCloudStorage;
		
		/*Testing the execution of the method updateAllCustomers,
		 * for the corresponding storage place*/
		myAdministration.updateAllCustomers();
		
	}//main

}//class
