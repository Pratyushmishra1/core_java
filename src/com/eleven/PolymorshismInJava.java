package com.eleven;

class G{
	
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	
	public void add(int a, int b,int c) {
		System.out.println(a+b+c);
	}
	
}

public class PolymorshismInJava extends G{
	
	public static void main(String[] args) {
		PolymorshismInJava inJava=new PolymorshismInJava();
		inJava.add(12, 12);
		inJava.add(23, 12, 11);
	}

}
