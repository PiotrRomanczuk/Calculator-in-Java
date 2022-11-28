package onlineShop.storage;

import onlineShop.interfaces.ICustomerStorage;
import onlineShop.users.Customer;

public class LocalStorage implements ICustomerStorage{

	@Override
	public void newCustomer(Customer k) {
		System.out.println("Executing method LocalStorage.newCustomer ...");	
	}

	@Override
	public Customer load(int customerNr) {
		System.out.println("Executing method LocalStorage.load ...");
		return null;
	}

	@Override
	public void update(Customer k) {
		System.out.println("Executing method LocalStorage.update ...");	
	}

	@Override
	public void cancel(int customerNr) {
		System.out.println("Executing method LocalStorage.cancel ...");			
	}

}//class
