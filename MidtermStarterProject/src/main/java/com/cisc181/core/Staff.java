package com.cisc181.core;

import java.util.Date;

public class Staff extends Employee {

	 private String eTitle;

	   public Staff(String etitle){
	        this.eTitle = etitle;
	    }

	    public void setTitle(String etitle){
	        this.eTitle = etitle;
	    }
	    public String geteTitle(){
	        return this.eTitle;
	    }

    

    
	public Staff(String FirstName, String MiddleName, String LastName,
			Date DOB, String Address, String Phone_number, String Email,
			String officeHours, int rank, double salary, Date hireDate,
			String eTitle) throws PersonException 
	
	{
		super(FirstName, MiddleName, LastName, DOB, Address, Phone_number,
				Email, officeHours, salary, hireDate);
		
		this.eTitle = eTitle;
	}

}