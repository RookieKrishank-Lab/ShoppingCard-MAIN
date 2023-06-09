package com.shoping.card.pojo;

import java.util.Date;
import com.shoping.card.entity.Customer;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class CustomerPojo {

	String customerId;
	
	String customerName;
	
	String dob;
	
	String gender;
	
	long salary;
	
	String country;
	
	public static Customer getEntity(CustomerPojo customerPojo) {
		Customer customer = new Customer();
		customer.setCustomerId(customerPojo.getCustomerId());
		customer.setName(customerPojo.getCustomerName());
		customer.setDob(customerPojo.getDob());
		customer.setCountry(customerPojo.getCountry());
		customer.setGender(customerPojo.getGender());
		customer.setSalary(customerPojo.getSalary());
		
		return customer;
	}
	
	public static CustomerPojo getPojo(Customer customer) {
		CustomerPojo customerPojo = new CustomerPojo();
		customerPojo.setCustomerId(customer.getCustomerId());
		customerPojo.setCustomerName(customer.getName());
		customerPojo.setDob(customer.getDob());
		customerPojo.setCountry(customer.getCountry());
		customerPojo.setGender(customer.getGender());
		customerPojo.setSalary(customer.getSalary());
		
		return customerPojo;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
