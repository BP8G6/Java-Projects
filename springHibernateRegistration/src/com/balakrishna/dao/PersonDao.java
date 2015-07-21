package com.balakrishna.dao;

import java.util.Set;

import com.balakrishna.hibernate.entities.Person;


public interface PersonDao {
	public  Set<Person> getAllPersons();
	
	public Person getPersonByPersonId(Long personId);
	
	public void savePerson(Person person);
	
	
	
	
}
