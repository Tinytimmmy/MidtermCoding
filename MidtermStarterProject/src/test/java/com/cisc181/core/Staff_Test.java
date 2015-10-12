package com.cisc181.core;

import java.util.ArrayList;
import java.util.Date;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;

import antlr.collections.List;

public class Staff_Test {
	public double sum;

	public static void main(String[] args){
		
		ArrayList<Staff> staffs = new ArrayList<Staff>();
		staffs.add("Chip", "Edward", "Kelly",1836,28,5, "123 Playcall Lane", "358-567-4657", "chipkelly@eagles.com", "M-F 9-5", 1, 100000.00, 2015,12,10, "MR"));
		staffs.add("Darren", "Lee", "Sproles",1963,7,7  , "43 Running Circle", "37-4657-546", "dsproles@eagles.com", "M-F 9-5", 4, 200000.00, 2015,12,10, "DR"));
		staffs.add("Sam", "Jacob", "Bradford",1977,20,10  , "7 Thowers Square", "416-546-0987", "sbradford@eagles.com", "M-F 9-5", 2, 100500.00, 2015,12,10, "DR"));
		staffs.add("Demarco", "Cowboy", "Murray",1978,13,8  , "29 Running Circle", "875-456-6952", "dmurray@eagles.com", "M-F 9-5", 3, 90000.00, 2015,12,10, "Professor"));
		staffs.add("Riley", "Thomas", "Cooper",1965,15,12 , "14 Receving Way", "610-358-9876", "rcooper@eagles.com", "M-F 9-5", 5, 140000.00, 2015,12,10, "MR"));
		
		double sum = 0;
		for(int s=0, s<5; s++){
			double var = staffs.get(s).getSalary();
			sum += var;
		}
		double Average = sum/5;
		assertEquals(Average, 126100);
			
			
}
