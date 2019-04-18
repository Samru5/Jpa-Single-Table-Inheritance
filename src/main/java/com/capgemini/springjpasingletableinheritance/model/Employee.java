package com.capgemini.springjpasingletableinheritance.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
public class Employee extends Person {

	@Column(name = "designation")
	private String designation;

	@Column(name = "salary")
	private float salary;

	public Employee() {
		super();
	}

	public Employee(long id, String name, String designation, float salary) {
		super(id, name);
		this.designation = designation;
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [designation=" + designation + ", salary=" + salary + "]";
	}

}
