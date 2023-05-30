package com.exception;

public class ExceptionInJava {
	
	public static void main(String[] args) {
		
		int a=10/2;
		try {
			int b=10/0;
			System.out.println(b);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("hello");
		}finally {
			System.out.println("finally block");
		}
		int c=10/2;
		int d=10/2;
		int e=10/2;

		System.out.println(a);
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		
	}

}
