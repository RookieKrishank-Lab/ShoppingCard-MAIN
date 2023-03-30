package com.shoping.card.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoping.card.entity.Customer;
import com.shoping.card.pojo.CustomerPojo;
import com.shoping.card.repository.CustomerRepository;
import com.shoping.card.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	public String createCustomer(CustomerPojo customerP) {
		 Customer customer =CustomerPojo.getEntity(customerP);
		customerRepository.save(customer);
		 return "create record successfully";
	}

	public Customer updateCustomerDetails(String CustomerId, Customer customer) {
		Optional<Customer> findById=customerRepository.findById(CustomerId);	 //puchnac hai "ID string nai hosakta hai" and which update is good like book or product update method
		if(findById.isPresent()) {
			Customer updateCustomer=findById.get();
			if(customer.getName()!=null && !customer.getName().isEmpty())
				updateCustomer.setName(customer.getName());
			if(customer.getDob()!=null && !customer.getDob().isEmpty())
				updateCustomer.setDob(customer.getDob());
			if(customer.getGender()!=null && !customer.getGender().isEmpty())
				updateCustomer.setGender(customer.getGender());
			if(customer.getSalary()!=0)
				updateCustomer.setSalary(customer.getSalary());
			if(customer.getCountry()!=null && !customer.getCountry().isEmpty())
				updateCustomer.setCountry(customer.getCountry());
			return customerRepository.save(updateCustomer);
		}
		return null;
	}

	public List<Customer> getAllCustomer(){				//if i write CustomerPojo in retun type it is showing error
		return customerRepository.findAll();
	}

	public CustomerPojo getCustomerById(String customerId) {
		Optional<Customer> customer = customerRepository.findById(customerId);
		// customerPojo= CustomerPojo.getPojo(oCustomer.get());
	//	if(oCustomer.isPresent()) {
			
//		}
		if(customer.isPresent()) {
			return CustomerPojo.getPojo(customer.get());
		}else{
			return null;
		}
	}
	
	public List<CustomerPojo> getCustomerByName(String name){
		List<Customer> oCustomer = customerRepository.getByName(name);
		List<CustomerPojo> pojo= new ArrayList<CustomerPojo>();
		for (Customer customer : oCustomer) {
			pojo.add(CustomerPojo.getPojo(customer));
		}
		return pojo;
	}

	public String deleteCustomer(String customerId) {
		customerRepository.deleteById(customerId);
		return "delete customer record with "+customerId;
	}
}
