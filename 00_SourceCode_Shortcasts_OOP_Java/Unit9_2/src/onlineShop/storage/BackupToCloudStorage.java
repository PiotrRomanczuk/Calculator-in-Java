package onlineShop.storage;

import onlineShop.interfaces.ICustomerStorage;
import onlineShop.users.Customer;

public class BackupToCloudStorage implements ICustomerStorage{

	@Override
	public void newCustomer(Customer k) {
		System.out.println("Executing method BackupToCloudStorage.newCustomer ...");	
	}

	@Override
	public Customer load(int customerNr) {
		System.out.println("Executing method BackupToCloudStorage.load ...");
		return null;
	}

	@Override
	public void update(Customer k) {
		System.out.println("Executing method BackupToCloudStorage.update ...");	
	}

	@Override
	public void cancel(int customerNr) {
		System.out.println("Executing method BackupToCloudStorage.cancel ...");			
	}

}//class
