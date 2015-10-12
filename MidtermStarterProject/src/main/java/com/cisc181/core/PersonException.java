package com.cisc181.core;

public class PersonException extends Exception {
	private Person testperson;

	public PersonException(Person PersonExcep) {
		this.setTestperson(PersonExcep);
	}

	public Person getTestperson() {
		return testperson;
	}

	public void setTestperson(Person testperson) {
		this.testperson = testperson;
	}
}