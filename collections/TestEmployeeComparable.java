package com.rays.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestEmployeeComparable {

		public static void main(String[] args) {

			EmployeeComparable e1 = new EmployeeComparable(1, "kanak", 15000);

			EmployeeComparable e2 = new EmployeeComparable(2, "devendra", 25000);

			EmployeeComparable e3 = new EmployeeComparable(3, "mahi", 55000);

			EmployeeComparable e4 = new EmployeeComparable(4, "shivam", 5000);

			EmployeeComparable e5 = new EmployeeComparable(5, "ayan", 20000);

			EmployeeComparable e6 = new EmployeeComparable(6, "mahi", 55000);

			List list = new ArrayList();

			list.add(e1);

			list.add(e2);

			list.add(e3);

			list.add(e4);

			list.add(e5);

			list.add(e6);
			
			Collections.sort(list);

			Iterator it = list.iterator();

			while (it.hasNext()) {

				Object object = it.next();

				EmployeeComparable e = (EmployeeComparable) object;

				System.out.println(e);

			}
		}

	}



