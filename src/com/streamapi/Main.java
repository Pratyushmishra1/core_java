package com.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
		
		Emp emp1=new Emp(1, "Ravi", 30000);
		Emp emp2=new Emp(2,"Ravinder", 50000);
		Emp emp4=new Emp(3, "Ravi Singh", 40000);
		Emp emp5=new Emp(4, "Karan", 20000);
		
		List<Emp> emps=new ArrayList<>();
		
		emps.add(emp1);
		emps.add(emp2);
		emps.add(emp4);
		emps.add(emp5);

		/*
		 * for(Emp emp:emps) { System.out.println(emp); }
		 */
		
		List<Emp> collect = emps.stream().filter(e->e.getSalary() > 30000).collect(Collectors.toList());
		collect.forEach(e->System.out.println(e));
	}

}
