package com.capgemini.springjpasingletableinheritance.model;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "PERSON")
public class Person {

	@Id
	@Column(name = "id")
	private long id;

	@Column(name = "name")
	private String name;

	public Person() {
		super();
	}

	public Person(long id,String name) {
		super();
		this.id=id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

}
