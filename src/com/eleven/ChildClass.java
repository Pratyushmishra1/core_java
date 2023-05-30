package com.eleven;

class SuperClass{
	
	String name="Ravi";
	
	public void msg() {
		System.out.println("hello");
	}
	
}

class SuperClass2 extends SuperClass{
	
	String fName="Parkash";
	
}


public class ChildClass extends SuperClass2{
	
	public static void main(String[] args) {
		ChildClass childClass=new ChildClass();
		System.out.println(childClass.name);
		System.out.println(childClass.fName);
		childClass.msg();
	}

}
