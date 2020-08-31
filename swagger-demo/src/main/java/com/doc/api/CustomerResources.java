package com.doc.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.doc.api.dto.Person;
import com.doc.api.service.CustomerService;

import io.swagger.annotations.ApiModel;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController()
@RequestMapping("/api")
@EnableSwagger2
@ApiModel(description="This contains API CRUD opertation of customer")
public class CustomerResources {

	@Autowired
	private CustomerService service;

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public List<Person> getAllCustomer() {
		return service.getAllDetails();
	}

	@RequestMapping(value = "/{personId}", method = RequestMethod.GET)
	public Person getById(@PathVariable("personId") long personId) {
		return service.findBypersonId(personId);
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public Person save(@RequestBody Person person) {
		return service.save(person);
	}

	@RequestMapping(value = "/update", method = RequestMethod.PATCH)
	public Person update(@RequestBody Person person) {
		return service.save(person);
	}

	@RequestMapping(value = "/delete/{personId}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("personId") long personId) {
		service.delete(personId);
	}

}
