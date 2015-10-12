package com.cisc181.core;

import java.util.UUID;

public class Enrollment {

	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;

	private Enrollment() {
	}

	public Enrollment(UUID student1, UUID section1, UUID enroll1) {
		this.setStudentID(UUID.randomUUID());
		this.setSectionID(UUID.randomUUID());
		this.setEnrollmentID(UUID.randomUUID());
	}

	public UUID getSectionID() {
		return SectionID;
	}

	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}

	public UUID getStudentID() {
		return StudentID;
	}

	public void setStudentID(UUID studentID) {
		StudentID = studentID;
	}

	public void setEnrollmentID(UUID enrollmentID) {
		EnrollmentID = enrollmentID;
	}
	
	public UUID getEnrollmentID() {
		return EnrollmentID;
	}

	public void setGrade(double grade1) {
		this.Grade = grade1;
	}

}

