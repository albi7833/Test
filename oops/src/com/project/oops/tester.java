package com.project.oops;

public class tester {
	public static void main(String[] args) {
		university UNIVERSITY = new university();
		UNIVERSITY.name= "KTU";
		UNIVERSITY.location= "kerala";
		UNIVERSITY.contactnumber=9675437643l;
		UNIVERSITY.displaydetailsofuniversity();
		UNIVERSITY.examdetails();
		UNIVERSITY.result();

		System.out.println("**************************");

		college COLLEGE = new college();
		COLLEGE.name = "Jyothi";
		COLLEGE.location ="Thrissur";
		COLLEGE.contactnumber =878753464234l;
		COLLEGE.displaydetailsofcollege();
		COLLEGE.collegeexams();
		COLLEGE.ethnicday();

		System.out.println("***********************");

		college COLLEGE2 = new college();
		COLLEGE2.name = "Malabar";
		COLLEGE2.location ="Thrissur";
		COLLEGE2.contactnumber =878753464234l;
		COLLEGE2.displaydetailsofcollege();
		COLLEGE2.collegeexams();
		COLLEGE2.ethnicday();

		System.out.println("***************");
		administration ADMINISTRATION = new administration();
		ADMINISTRATION.collectingfees();
		ADMINISTRATION.documentverification();
		ADMINISTRATION.records();
	}




}
