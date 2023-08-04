package com.rays.collections;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class TestListCollection {

	public static void main(String[] args) {
		
		java.util.List l1 = new ArrayList();
		
		l1.add("one");
		System.out.println("l1 =" + l1);
		System.out.println();
		
		l1.add("Taehyung");
		System.out.println("l1 = " + l1);
		System.out.println("l1.get at 1 index = " + l1.get(1));
		System.out.println();
		
		l1.add("Jimin");
		l1.add("Jhope");
		l1.add("Suga");
		l1.add("Jin");
		l1.add("RM");
		System.out.println("list = " + l1);
		System.out.println();
				
		l1.set(0, "Jungkook");
		System.out.println("list = " + l1);
		System.out.println("l1.get at 2 index = " + l1.get(2));
		System.out.println("l1.get at 1 index = " + l1.get(1));
		System.out.println("l1.get at 0 index = " + l1.get(0));
		System.out.println();
		
		System.out.println("index Of Suga = "+ l1.indexOf("Suga") );
		System.out.println();

		l1.add("Taehyung");
		System.out.println("list = " + l1);
		System.out.println();
		System.out.println("Last Index of Taehyung = "+ l1.lastIndexOf("Taehyung") );	
		System.out.println();
		System.out.println("SubList = "+ l1.subList(0,4) );

		
		System.out.println();
		Iterator it = l1.iterator();
		while (it.hasNext()) {
		System.out.println(it.next());

		}
	}
}
