package com.mycompany.eb.practiceproject1;
import java.util.Scanner;

public class ArthmaticCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the two values");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("Enter the operator");
		char c=s.next().charAt(0);
		double ans=0;
		switch(c) {
			case '+':
				ans=a+b;
				break;
			case '-':
				ans=a-b;
				break;
			case '*':
				ans=a*b;
				break;
			case '/':
				ans=a/b;
				break;
				
		}
		System.out.println(ans);

	}

}
