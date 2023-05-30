package com.eleven;

class M{
	
	int a=10;
	
}

public class StudentDao extends M{
	
	//fied
	public StudentDao(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	//super
	public StudentDao() {
	}

	//getter setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	private int id;
	private String name;
	
	public void showData() {
		System.out.println(this.name);
		System.out.println(super.a);
	}
	
}
