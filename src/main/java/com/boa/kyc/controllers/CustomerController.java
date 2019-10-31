package com.boa.kyc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.boa.kyc.models.Customer;
import com.boa.kyc.services.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	//adding the customer
	@CrossOrigin("*")
	@PostMapping("/addcustomer")
	public @ResponseBody Customer addCustomerData(@RequestBody Customer customer)
	{
		
		return this.customerService.addCustomer(customer);
	}
	//getall
	@CrossOrigin("*")
	@GetMapping("/getallcustomers")
	public @ResponseBody List<Customer> getAllCustomerData()
	{
		
		return this.customerService.gerAllCustomers();
	}
	//getcustomer byid
	@CrossOrigin("*")
	@GetMapping("/getcustomerbyid/{id}")
	public @ResponseBody Customer getCustomerDataById(@PathVariable  int id )
	{
		
		return this.customerService.getCustomerById(id);
	}
	
	//delete customer
	//getcustomer byid
	@CrossOrigin("*")
	@GetMapping("/deletecustomerbyid/{id}")
	public void deleteCustomerDataById(@PathVariable  int id )
		{
			
			this.customerService.deleteCustomerById(id);
		}
	
	@CrossOrigin("*")
	@GetMapping("/updatecustomerfirstname/{Id}/{fname}")
	public void updateCustomerFirstName(@PathVariable  int Id , @PathVariable String fname)
		{
			
			this.customerService.updateFirstName(Id, fname);
		}
	
	
	
}
