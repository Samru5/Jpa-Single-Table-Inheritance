package com.capgemini.springjpasingletableinheritance.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.springjpasingletableinheritance.model.Person;


public interface PersonDao extends JpaRepository<Person, Long> {

}
