package com.mycompany.eb.Assignments;
import java.util.Scanner;

public class Conversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		System.out.println("String to Int");
		int i=Integer.parseInt(str);
		System.out.println(i);
		System.out.println("String to Short");
		short s=Short.parseShort(str);
		System.out.println(s);
		System.out.println("String to Long");
		long l=Long.parseLong(str);
		System.out.println(l);
		System.out.println("String to Float");
		float f=Float.parseFloat(str);
		System.out.println(f);
		System.out.println("String to double");
		double d=Double.parseDouble(str);
		System.out.println(d);

		System.out.println("Enter the String");
		String str1=sc.next();
		System.out.println("String to Boolean");
		boolean b=Boolean.getBoolean(str1);
		System.out.println(b);

	}

}
