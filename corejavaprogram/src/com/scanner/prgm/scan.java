package com.scanner.prgm;
import java.util.Scanner;

public class scan {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter rollno:");
	int rollno=sc.nextInt();
	sc.nextLine();
	System.out.println("enter name:");
    String name=sc.next();
    
    System.out.println("rollno:"+rollno + "name:"+name);
	}

}
