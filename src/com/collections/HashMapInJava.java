package com.collections;

import java.util.HashMap;

public class HashMapInJava {
	
	public static void main(String[] args) {
		
		HashMap<String, String> hashMap=new HashMap<>();
		hashMap.put("1", "b");
		hashMap.put("2", "b");
		hashMap.put("3", "c");
		hashMap.put("4", "bd");
		
		
		System.out.println(hashMap.get("1"));
		
	}

}
