package com.eleven;

public class Main {
	
	public static void main(String[] args) {
		
//		StudentDao studentDao=new StudentDao();
//		studentDao.setId(1);
//		studentDao.setName("Karan");
//		
//		System.out.println(studentDao.getId());
//		System.out.println(studentDao.getName());
		
		StudentDao studentDao=new StudentDao(3, "raj");
		System.out.println(studentDao.getId());
		System.out.println(studentDao.getName());
	}

}
