package com.shoping.card.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
	
	@Id
	@Column(name = "Customer_Id", nullable = false)
	String customerId;
	@Column(name = "Customer_Name", nullable = false)
	String name;
	@Column(name = "Date_Of_Birth")
	String dob;
	@Column(name = "Gender")
	String gender;
	@Column(name = "Salary")
	long salary;
	@Column(name = "Country")
	String country;
//    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    private Set<Card> cards;
//	
//    public Customer(String customerId, String name, String gender, long salary) {
//		super();
//		CustomerId = customerId;
//		name = name;
//		this.gender = gender;
//		this.salary = salary;
//	}


	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
		public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
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
