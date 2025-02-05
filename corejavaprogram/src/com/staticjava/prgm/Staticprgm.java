package com.staticjava.prgm;

public class Staticprgm {
	int eid;
	String name;
	static String company_name="S N D DELIGHTS";
	
	Staticprgm(int r,String n){
		eid=r;
		name=n;
	}
	
	void display() {
		System.out.println("eid:"+eid + " name:" + name +  " company name: " + company_name);
	}
	

	public static void main(String[] args) {
		
		Staticprgm s=new Staticprgm(12,"Dinesh");
		s.display();

	}

}
