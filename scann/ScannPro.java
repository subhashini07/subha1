package org.scann;

import java.util.Scanner;

public class ScannPro {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter emp id");
		int i = sc.nextInt();
		System.out.println("EMP ID :" +i);
		System.out.println("emp name");
		String s = sc.next();
		System.out.println("EMP NAME :" +s);
		System.out.println("emp age");
		short s1 = sc.nextShort();
		System.out.println("Emp AGE :" +s1);
		System.out.println("per");
		boolean b = sc.nextBoolean();
		System.out.println("PERMANENT :" +b);
		System.out.println("emp mobile no");
		long l = sc.nextLong();
		System.out.println("Emp Mobile NO :" +l);
		System.out.println(" emp salary");
		float f = sc.nextFloat();
		System.out.println("Emp Salary :" +f);
		System.out.println("bonus per");
		double d = sc.nextDouble();
		System.out.println("Bonus Per :" +d);
		
	}

}
