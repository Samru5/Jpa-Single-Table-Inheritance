package com.capgemini.springjpasingletableinheritance.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.springjpasingletableinheritance.dao.PersonDao;
import com.capgemini.springjpasingletableinheritance.model.Employee;
import com.capgemini.springjpasingletableinheritance.model.Person;
import com.capgemini.springjpasingletableinheritance.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	private PersonService service;
	@Autowired
	PersonDao dao;
	@RequestMapping("/new")
	public Employee addNew() {

		Employee employee = new Employee(123,"John","Analyst", 45000);
		service.add(employee);
		return employee;

	}

	
}
