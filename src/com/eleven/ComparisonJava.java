package com.eleven;

public class ComparisonJava {

	public static void main(String[] args) {
		
		int a=5;
		
		if(a == 5) {
			System.out.println("a is equal to 5");
		}else {
			System.out.println("a is not equal to 5");
		}
		
		
		
		switch (a) {
		case 5: 
			System.out.println("equal to five");
			break;
			
		case 4: 
			System.out.println("equal to four");
			break;
			
		case 3: 
			System.out.println("equal to three");
			break;
			
		default:
			System.out.println("not exit");
		
		}
		
		
	}
	
}
