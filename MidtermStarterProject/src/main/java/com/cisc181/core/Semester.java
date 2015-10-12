package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Semester {
	public UUID SemesterID;
	public Date StartDate;
	public Date EndDate;

	public Semester(Date startdate, Date enddate) {
		SemesterID = UUID.randomUUID();
		this.StartDate = startdate;
		this.EndDate = enddate;
	}


	public Date getStartDate() {
		return StartDate;
	}

	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}

	public Date getEndDate() {
		return EndDate;
	}

	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}

}
