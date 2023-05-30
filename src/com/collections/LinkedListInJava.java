package com.collections;

import java.util.LinkedList;

public class LinkedListInJava {
	
	public static void main(String[] args) {
		
		LinkedList<String> linkedList=new LinkedList<>();
		
		linkedList.add("d");
		linkedList.add("c");
		linkedList.add("a");
		linkedList.add("b");
		
		
		for(String  li:linkedList) {
			System.out.println(li);
		}
		
	}

}
