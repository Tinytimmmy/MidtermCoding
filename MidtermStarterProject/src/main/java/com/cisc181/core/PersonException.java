package com.cisc181.core;

public class PersonException extends Exception {
	private String Person;
	private Person testperson;

	public PersonException(Person PersonExcep) {
		this.setTestperson(PersonExcep);
	}

	public String getPerson() {
		return Person;
	}

	public void setPerson(String person) {
		Person = person;
	}

	public Person getTestperson() {
		return testperson;
	}

	public void setTestperson(Person testperson) {
		this.testperson = testperson;
	}
}