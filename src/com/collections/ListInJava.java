package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ListInJava {
	
	public static void main(String[] args) {
		
		ArrayList<String> arrayList=new ArrayList<>();
		
		arrayList.add("b");
		arrayList.add("c");
		arrayList.add("a");
		arrayList.add("d");
		
		System.out.println("with get method "+arrayList.get(0));
		
//		arrayList.set(1, "5");
		
		System.out.println("with set method "+arrayList.get(1));
		
		arrayList.remove(3);
		
		Collections.sort(arrayList);
		
		System.out.println(arrayList.size());
		
		for(String array:arrayList) {
			System.out.println(array);
		}
		
	}

}
