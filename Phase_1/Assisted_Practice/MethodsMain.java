package com.mycompany.eb.Assignments;
class Methods{
	int id;
    String name;
    double salary;
    public Methods(int id,String name,double salary) {
    	this.id=id;
    	this.name=name;
    	this.salary=salary;
    	
    }
    void display() {
    	System.out.println("current details");
    	System.out.println(id+" "+name+" "+salary);
    }
    double displaySal() {
    	System.out.println(" Current salary");
    	return salary;
    }
    double incSal(double bonus) {
    	System.out.println("incremented salary");
    	return salary+bonus;
    }
    void displayName(String n) {
    	System.out.println("updated name");
    	System.out.println(n);
    }
}
public class MethodsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods m=new Methods(101,"sudha",10000);
		m.display();
		double d=m.displaySal();
		System.out.println(d);
		double newSal=m.incSal(500);
		System.out.println(newSal);
		m.displayName("savitri");
		
		

	}

}
