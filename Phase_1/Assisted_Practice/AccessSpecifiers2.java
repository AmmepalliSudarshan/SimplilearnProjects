package com.mycompany.eb.Assignments;
//2. using private access specifiers
class PriaccessSpecifier 
{ 
 private void display() 
  { 
      System.out.println("You are using private access specifier"); 
  } 
} 


public class AccessSpecifiers2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//private
		System.out.println("Private Access Specifier");
		PriaccessSpecifier  obj = new PriaccessSpecifier(); 
        //trying to access private method of another class 
        //obj.display();


	}

}
