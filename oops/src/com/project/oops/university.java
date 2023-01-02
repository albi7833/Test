package com.project.oops;
///parent class///
public class university {
	String name;
	String location;
	long contactnumber;	

	public void displaydetailsofuniversity() {   ///method
		System.out.println("university_dispalydetails");
		System.out.println("name:  "+name);
		System.out.println("loaction:  "+location);
		System.out.println("contactnumber:  "+contactnumber);

	}


	public void examdetails() {  ///////method
		System.out.println("exam deatils");

	}
	public void result() {
		System.out.println("result details");
	}
}