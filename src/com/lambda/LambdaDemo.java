package com.lambda;

@FunctionalInterface
interface Drawable{
	public void draw(int a);
}

public class LambdaDemo {
	
	public static void main(String[] args) {
		int width=10;
		
		
		Drawable d2=(b)->
			System.out.println("with "+b);
		
		
		d2.draw(1);
	}

}
