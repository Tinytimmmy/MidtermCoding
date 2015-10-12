package com.cisc181.core;

import java.util.Date;

public class Student extends Person {

	private String eMajor;
	
	public String getMajor ( )
    {
        return this.eMajor;
    }
    public void setMajor (String eMajor)
    {
        this.eMajor = eMajor;           
    }
    
	public Student(String FirstName, String MiddleName, String LastName,Date DOB, String eMajor,
			String Address, String Phone_number, String Email) throws PersonException 
	{
		super(FirstName, MiddleName, LastName, DOB, Address, Phone_number, Email);
		this.eMajor = eMajor;
		
	}
	
	@Override
	public void PrintName() {
		System.out.println(getLastName() + ","  + getFirstName() + ' ' + getMiddleName());
	}

	public void PrintName(boolean bnormal)
	{
		super.PrintName();
	}
}