package RealLifeInterfaceAbstract;

import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Concrete.CustomerCheckManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.setId(0);
		customer.setFirstName(("HASAN"));
		customer.setLastName("ÖZ");
		customer.setNationalyId("12345678901");
		customer.setDateOfBirth(LocalDate.of(2002, 01, 10));
		
		
		BaseCustomerManager customerManager= new StarbucksCustomerManager(new CustomerCheckManager()) ;
		
		
		customerManager.save(customer);
		
		
		
		
		
	}

}
