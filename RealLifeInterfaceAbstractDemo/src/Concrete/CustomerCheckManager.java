package Concrete;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		if (customer.getNationalyId()=="12345678901"&&
				customer.getFirstName()=="HASAN"&&customer.getLastName()=="ÖZ") {
			return true;
		}else {
			return false;
		}
	}

}
