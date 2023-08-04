package com.rays.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestEmployee1 {
	public static void main(String[] args) {

		Employee1 e1 = new Employee1(1, 25000, "kanak");

		Employee1 e2 = new Employee1(2, 25000, "Anish");

		Employee1 e3 = new Employee1(3, 25000, "Uday");

		Employee1 e4 = new Employee1(4, 25000,  "Abhishek");

	
		List list = new ArrayList();

		list.add(e1);

		list.add(e2);

		list.add(e3);

		list.add(e4);

		
		Iterator it = list.iterator();

		while (it.hasNext()) {

			Object object = it.next();

			Employee1 e = (Employee1) object;
			System.out.println(e);

		/*	System.out.print(e.getId());
			System.out.print("\t" + e.getSalary());
			System.out.println("\t" + e.getName());*/
			

		}
	}

}
