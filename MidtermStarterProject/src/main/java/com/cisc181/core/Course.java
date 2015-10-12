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
	public UUID getCourseID(){
		return CourseID;
	}
	public void setCourseID(UUID courseid){
		this.CourseID = courseid;
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String course1) {
		this.CourseName = course1;
	}

	public int getGradePoints() {
		return GradePoints;
	}

	public void setGradePoints(int gradep) {
		this.GradePoints = gradep;
	}

	public eMajor getMajor() {
		return Major;
	}

	public void setMajor(eMajor maJor) {
		Major = maJor;
	}
}
