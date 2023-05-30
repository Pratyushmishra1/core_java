package com.collections;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetInJava {

	public static void main(String[] args) {
		
		/*
		 * HashSet<String> hashSet=new HashSet<>(); hashSet.add("d"); hashSet.add("n");
		 * hashSet.add("n"); hashSet.add("b"); hashSet.add("a");
		 * 
		 * 
		 * for(String hash:hashSet) { System.out.println(hash); }
		 */
		
		TreeSet<String> treeSet=new TreeSet<>();
		treeSet.add("c");
		treeSet.add("d");
		treeSet.add("a");
		treeSet.add("b");
		
		for(String hash:treeSet) { System.out.println(hash); }
		
	}
	
}
