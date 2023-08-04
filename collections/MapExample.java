package com.rays.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MapExample {
	private static final char[] object = null;

	public static void main( String[] args) {
		
		Map map = new HashMap();
		
		map.put(1, "one");
		System.out.println("Map ="+ map);
		System.out.println();
		
		map.put(1, "anish");
		
		map.put(2, "abhishek");
		
		
		map.put(55, "sushmita mem");
		System.out.println(map);
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.size());
		
		System.out.println();
		
		for(Object object: map.values()) {
		
	System.out.println(object);
		
	}
	

	}
	
	
	

}
