package com.construct.prgrm;

public class Para_con {
	Para_con(int a){
		System.out.println("parameter constrctor " + a);
	}
	Para_con(int b,String c){
		System.out.println("two parameters " + b + " " + c );
	}

	public static void main(String[] args) {
		Para_con d= new Para_con(123);
		Para_con d1=new Para_con(22,"gana");
		Para_con d2=new Para_con(12,"riya");

	}

}
