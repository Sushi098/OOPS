package com.rays.collections;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	
	public static void main(String[] args) {
		
		Collection c1 = new ArrayList();
		c1.add(100);
		c1.add("two");
		c1.add(200);
		c1.add("ten");
				
		System.out.println("c1 = " + c1);
	

	Collection c2 = new ArrayList();
	
	c2.add("hii");
	c2.add("ten");
	c2.add("hello");
	
	System.out.println("c2 = "+ c2);
	
	c2.addAll(c1);
	System.out.println("c2 after addAll = "+c2);
	
	c1.contains(c2);	
	System.out.println("c1.contains(c2) = "+ c1.contains(c2));
	
	System.out.println("c2.containsAll(c1) = "+ c2.containsAll(c1));
	c1.remove("100");
	System.out.println("c1.remove = "+ c1.remove(100));
	
	System.out.println("c1 = " + c1);
	
	
	Collection c3 = new ArrayList();
	c3.add("KIM");
	c3.add("TAEHYUNG");
	c3.add("V");
	System.out.println("c3 = " + c3);
	 
	c3.isEmpty();
	System.out.println("c3.isEmpt= " +c3.isEmpty());
	System.out.println("c3 = " + c3);

	c3.clear();
	System.out.println("c3 = " + c3);
	
	c3.isEmpty();
	System.out.println("c3.isEmpty = " + c3.isEmpty());
	
	
	
}
}