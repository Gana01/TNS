package com.exceptionprgm.java;

public class Withexception {

	public static void main(String[] args) {
		int d=0;
		System.out.println("hello");
		try {
			int a=5/0;
		}
		catch(ArithmeticException e) {
			System.out.println("exception caught "+e);
			System.out.println("java");
		}


	}

}
