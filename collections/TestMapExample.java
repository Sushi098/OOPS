package com.rays.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ForkJoinPool;

public class TestMapExample {
	
	public static void main(String[] args) {
		
		Map map = new HashMap();
		
		map.put(1, "One");
		System.out.println("Map = " + map);
		System.out.println();
		
		map.put(2, "V");
		map.put(3, "JK");
		map.put(4, "JM");
		map.put(5, "RM");
		System.out.println("Map = " + map);
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.size());
		
		System.out.println();
		
		for(Object object : map.keySet()) {
			System.out.println(object);
		}
		
		System.out.println();
		for(Object object : map.values()) {
			System.out.println(object);
		}
		System.out.println();
		
		Set s = map.entrySet();
		for(Object object : s) {
			System.out.println(object);
		}
		
		map.containsKey(2);
		System.out.println("map.containsKey(2) = " + map.containsKey(2));
		
		System.out.println();
		map.containsValue("V");
		System.out.println("map.containsValue(V) = " + map.containsValue("V"));
		System.out.println();
		map.remove(1);
		System.out.println("After removing 1 key = "+ map.remove(1));
		System.out.println();
		System.out.println(map);
		System.out.println();
		
				
	//	map.clear();
	//	System.out.println("Map = "+ map);
		
		
	}

}
