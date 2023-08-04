package com.rays.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestoneEmployee {

		public static void main(String[] args) {

			EmployeeComparable e1 = new EmployeeComparable(1, "kanak", 15030);

			EmployeeComparable e2 = new EmployeeComparable(2, "devendra", 25080);

			EmployeeComparable e3 = new EmployeeComparable(3, "anish", 55700);

			EmployeeComparable e4 = new EmployeeComparable(4, "uday", 50080);

			EmployeeComparable e5 = new EmployeeComparable(5, "abhishek", 20100);

			List list = new ArrayList();

			list.add(e1);

			list.add(e2);

			list.add(e3);

			list.add(e4);

			list.add(e5);

			Collections.sort(list, new OrderByNameAsc());

			Iterator it = list.iterator();

			while (it.hasNext()) {

				Object object = it.next();

				EmployeeComparable e = (EmployeeComparable) object;

				
				System.out.println(e);

			}

		}

	}



