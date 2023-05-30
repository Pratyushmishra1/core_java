package com.eleven;

class N{
	
	void eat() {
		System.out.println("eating ....");
	}
	
}

public class OverrindingInJava extends N{
	
	void eat() {
		System.out.println("eating 2 ....");
	}
	
	public static void main(String[] args) {
		OverrindingInJava inJaOverrindingInJava=new OverrindingInJava();
		
		inJaOverrindingInJava.eat();
		
	}

}
