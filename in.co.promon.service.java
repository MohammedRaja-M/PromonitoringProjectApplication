package in.co.promon.service;
import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.promon.Model.Customer;
import in.co.promon.repository.customerRepository;

@Service
public class customerService {
	private static final Logger logger=Logger.getLogger(customerService.class);
	@Autowired
    private customerRepository custorepository;

    public Customer saveCustomer(Customer customer) {
    	logger.info(" The Process to Get The Customer ");
        return custorepository.save(customer);
    }

    public List<Customer> saveCustomers(List<Customer> customers) {
    	logger.info(" The Process to Add The All Customer ");
        return custorepository.saveAll(customers);
    }

    public List<Customer> getCustomers() {
    	logger.info(" The Process to Get The All Customer ");
        return custorepository.findAll();
    }

    public Customer getCustomerById(int id) {
    	logger.info(" The Process to Get The Particular Customer ");
        return custorepository.findById(id).orElse(null);
    }

    public Customer getCustomerByFirstName(String name) {
    	logger.info(" The Process to Get The Customer By Name ");
        return custorepository.findByFirstName(name);
    }

    public String deleteCustomer(int id) {
    	logger.info(" The Process to Delete The Customer ");
    	custorepository.deleteById(id);
        return "customer removed " + id;
    }

    public Customer updateCustomer(Customer customer) {
        return custorepository.save(customer);
    }
}