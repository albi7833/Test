package com.project.operators;

public class logicalopeartor {
	public static void main(String[] args) {
		boolean a =true;
		boolean b= false;
		System.out.println("the OR is "+(a||b));
		System.out.println("the AND is "+(a&&b));
		System.out.println("the NOR is "+!(a||b));
		System.out.println("the NAND is "+!(a&&b));
	}

}
