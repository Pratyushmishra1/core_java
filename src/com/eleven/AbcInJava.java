package com.eleven;

/*interface  Atm{
	
	void deposit();
	
}*/

abstract class Atm{
	abstract void deposit();
}

public class AbcInJava extends Atm{

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		AbcInJava abcInJava=new AbcInJava();
		abcInJava.deposit();
	}

}
