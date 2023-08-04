package com.rays.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
	
		public static void main(String[] args) {

			List list = new ArrayList();

			list.add("one");
			list.add(2);
			list.add("three");
			list.add(10);

			Iterator it = list.iterator();
			
			list.add(100);

			while (it.hasNext()) {

				System.out.println(it.next());

			}

		}

	}
