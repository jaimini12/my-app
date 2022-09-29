package com.mycompany.app.my_app;

public class Inheritance1 {
	public static void main() {
		Dept2 d = new Dept2();
		d.showMain();
		d.showDept();
		
		emp e = new emp();
		e.showMain();
		e.showemp();
	}

	void showMain() {
		System.out.println("It is a Main method...");
	}

}
class Dept2 extends Inheritance1{
	
	void showDept() {
		System.out.println("It is a Dept method...");
	}
}
class emp extends Inheritance1{
	void showemp() {
		System.out.println("It is a emp method...");
	}
	
}
