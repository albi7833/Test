package com.project.oops;
/////child class/////
public class college extends university{
	///String name;
	///String location;
	///long contactnumber;	

	public void displaydetailsofcollege() {   ///method
		System.out.println("college_dispalydetails");
		System.out.println("name:  "+name);
		System.out.println("loaction:  "+location);
		System.out.println("contactnumber:  "+contactnumber);
	}
	public void collegeexams() {
		System.out.println("college conducts govt exams");
	}
	public void ethnicday() {
		System.out.println("college conducts ethnic day");
	}
}
