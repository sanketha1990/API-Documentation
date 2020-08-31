package com.doc.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doc.api.dto.Person;
import com.doc.api.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository repository;

	List<Person> people = null;

	public List<Person> getAllDetails() {
		people = new ArrayList<Person>();
		repository.findAll().forEach(people::add);
		return people;
	}

	public Person findBypersonId(long personId) {
		return repository.findByPersonId(personId);
	}

	public Person save(Person person) {
		return repository.save(person);
	}

	public Person update(Person person) {
		return repository.save(person);
	}

	public void delete(long personId) {
		repository.deleteById(personId);
	}
}
