package com.capgemini.springjpasingletableinheritance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.capgemini.springjpasingletableinheritance.dao.PersonDao;
import com.capgemini.springjpasingletableinheritance.model.Employee;
import com.capgemini.springjpasingletableinheritance.model.Person;
import com.capgemini.springjpasingletableinheritance.service.PersonService;

@Service
public class personServiceImpl implements PersonService {

	@Autowired
	PersonDao dao;
	
	
	
	@Override
	public void add(Employee employee) {
		dao.save(employee);

	}

}
