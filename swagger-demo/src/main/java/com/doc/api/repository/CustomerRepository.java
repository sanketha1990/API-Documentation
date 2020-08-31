package com.doc.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.doc.api.dto.Person;

@Repository
public interface CustomerRepository extends CrudRepository<Person, Long> {
public Person findByPersonId(long personId);
}
