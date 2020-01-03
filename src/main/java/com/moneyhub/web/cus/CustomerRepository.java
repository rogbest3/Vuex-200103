package com.moneyhub.web.cus;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long>{
	public Customer findByCemailAndCpwd(String cemail, String cpwd);
	public Customer findByCemail(String cemail);

	public List<Customer> findByRole(String role);
	
	@Query(value="SELECT * FROM CUSTOMER GRUOP BY HAK", nativeQuery = true)
	public List<Customer> findGroupByHak();
	
	
}
