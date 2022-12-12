package in.co.promon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.co.promon.Model.Customer;

@Repository
public interface customerRepository extends JpaRepository<Customer, Integer	>{
	Customer findByFirstName(String name);
}