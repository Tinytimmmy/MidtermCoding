package com.cisc181.core;

import java.util.UUID;
import com.cisc181.eNums.eMajor;

public class Course {

	public UUID CourseID;
	public String CourseName;
	public int GradePoints;
	public eMajor Major;

	public Course(String course1, int gradep, eMajor major) {
		this.CourseID = UUID.randomUUID();
		this.CourseName = course1;
		this.GradePoints = gradep;
		this.Major = major;
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String coursename) {
		this.CourseName = coursename;
	}

	public int getGradePoints() {
		return GradePoints;
	}

	public void setGradePoints(int gradePoints) {
		this.GradePoints = gradePoints;
	}

	public eMajor getMajor() {
		return Major;
	}

	public void setMajor(eMajor maJor) {
		Major = maJor;
	}
}
