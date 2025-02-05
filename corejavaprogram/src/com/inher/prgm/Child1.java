package com.inher.prgm;

public class Child1 extends Parent1 {
	int a=12;
	
	void drink() {
		System.out.println("cool drink");
	}
	
	void display() {
		System.out.println(super.a);
		System.out.println(a);
		
		drink();
		super.drink();
	}

	public static void main(String[] args) {
		Child1 c=new Child1();
		c.display();

	}

}
