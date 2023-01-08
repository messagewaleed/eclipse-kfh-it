package com.waleed.kfh.training.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Place {

	@Id
	private Integer id;
	
	private String name;
	
	private String country;
	
	
	@ManyToOne
	private Employee employee;
	
	

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Integer getId() {
		return id;
	}
	
	Place(){
		
	}

	public Place(Integer id, String name, String country, Integer employeeId) {

		this.id = id;
		this.name = name;
		this.country = country;
		this.employee = new Employee(employeeId, "", "");
	}

	@Override
	public String toString() {
		return "Place [id=" + id + ", name=" + name + ", country=" + country + "]";
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
