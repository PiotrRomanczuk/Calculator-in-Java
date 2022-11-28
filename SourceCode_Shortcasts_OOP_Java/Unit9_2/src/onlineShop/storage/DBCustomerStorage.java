package onlineShop.storage;

import onlineShop.interfaces.ICustomerStorage;
import onlineShop.users.Customer;

public class DBCustomerStorage implements ICustomerStorage{

	@Override
	public void newCustomer(Customer k) {
		System.out.println("Executing method DBCustomerStorage.newCustomer ...");	
	}

	@Override
	public Customer load(int customerNr) {
		System.out.println("Executing method DBCustomerStorage.load ...");
		return null;
	}

	@Override
	public void update(Customer k) {
		System.out.println("Executing method DBCustomerStorage.update ...");	
	}

	@Override
	public void cancel(int customerNr) {
		System.out.println("Executing method DBCustomerStorage.cancel ...");			
	}

}//class
