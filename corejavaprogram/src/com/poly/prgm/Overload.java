package com.poly.prgm;

public class Overload {

	void add(int a,int c) {
		System.out.println(a+c);
	}
	void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		Overload l=new Overload();
		l.add(0,2);
		l.add(1,2,3);
	

	}

}
