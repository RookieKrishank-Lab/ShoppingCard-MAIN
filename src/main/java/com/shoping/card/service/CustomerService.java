package com.shoping.card.service;

import java.util.List;

import com.shoping.card.entity.Customer;
import org.springframework.stereotype.Service;

import com.shoping.card.pojo.CustomerPojo;

@Service
public interface CustomerService {
	
	public String createCustomer(CustomerPojo customer);

	public Customer updateCustomerDetails(String CustomerId, Customer customer);
	
	public CustomerPojo getCustomerById(String customerId);
	
	public List<CustomerPojo> getCustomerByName(String name);

	public String deleteCustomer(String customerId);
	public List<Customer> getAllCustomer();

}
