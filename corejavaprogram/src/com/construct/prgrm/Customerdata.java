package com.construct.prgrm;
import java.util.Scanner;

public class Customerdata {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name:");
		String name=sc.next();
		System.out.println("enter id:");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("enter address:");
		String address=sc.next();
		
		Customer c=new Customer(name,id,address);
		c.setCustomer_name(name);
		c.setCustomer_id(id);
		c.setCustomer_address(address);
		System.out.println(c);

	}

}
