package com.mycompany.eb.Assignments;

class Calc{
	int a;
	int b;
	int add() {
		return a+b;
		
	}
	int sub() {
		return a-b;
	}
	int mul() {
		return a*b;
	}
	int div() {
		return a/b;
	}
}
public class ArthCalc {
	public static void main(String[] args) {
		Calc c=new Calc();
		c.a=10;
		c.b=3;
		System.out.println(c.add());
		System.out.println(c.sub());
		System.out.println(c.mul());
		System.out.println(c.div());
		
	}

}
