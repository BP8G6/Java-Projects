package com.balakrishna.service;

import java.util.Set;



import com.balakrishna.hibernate.entities.Person;


public interface PersonService {

	public Set<Person> getAllPersons();
	
	public void persistPerson(Person person);
	
	public Person getPersonByPersonId(Long id);

	
}
