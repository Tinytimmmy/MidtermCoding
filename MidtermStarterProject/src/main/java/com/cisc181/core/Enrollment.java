package com.cisc181.core;

import java.util.UUID;

public class Enrollment {

	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;

	private Enrollment() {
	}

	public Enrollment(UUID student1, UUID section1) {
		this.StudentID = student1;
		this.SectionID = section1;
		this.EnrollmentID = UUID.randomUUID();
	}

	public void setGrade(double grade1) {
		this.Grade = grade1;
	}
}