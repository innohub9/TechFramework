package com.boa.kyc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.boa.kyc.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

	@Modifying(clearAutomatically = true)
	@Query("update Customer set firstName =:fname where customerId =:Id")
	void updateCustomer(@Param("Id") int Id, @Param("fname") String fname);
}
