package onlineShop.interfaces;

import onlineShop.users.Customer;

public interface ICustomerStorage {
	public void newCustomer(Customer k);
	public Customer load(int customerNr);
	public void update(Customer k);
	public void cancel(int customerNr);
}//interface
