package com.eleven;

interface B{
	public void msg();
}

class V{
	int b=19;
}

public class MultipleIn extends V implements B{
	
	public static void main(String[] args) {
		MultipleIn multipleIn=new MultipleIn();
		System.out.println(multipleIn.b);
		multipleIn.msg();
	}

	@Override
	public void msg() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}

}
