package com.cisc181.core;

import java.util.UUID;

public class Section {
	
	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID;
	private int RoomID;

	public Section(UUID sectionID, UUID courseID, UUID semesterID, int roomid){
		this.SectionID = UUID.randomUUID();
		this.CourseID = UUID.randomUUID();
		this.SemesterID = UUID.randomUUID();
		this.RoomID = roomid;
	}
	
	public UUID getCourseID() {
		return CourseID;
	}

	public void setCourseID(UUID courseID) {
		this.CourseID = courseID;
	}

	public UUID getSemesterID() {
		return SemesterID;
	}

	public void setSemesterID(UUID semesterID) {
		this.SemesterID = semesterID;
	}

	public UUID getSectionID() {
		return SectionID;
	}

	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}

	public int getRoomID() {
		return RoomID;
	}

	public void setRoomID(int RoomiD) {
		this.RoomID = RoomiD;
	}

}
