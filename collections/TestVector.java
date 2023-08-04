package com.rays.collections;

import java.util.Enumeration;
import java.util.Vector;
public class TestVector {

		public static void main(String[] args) {

			Vector v = new Vector();

			v.add("one");
			v.add(2);
			v.add("three");
			v.add(10);

			Enumeration e = v.elements();
			
			v.add(100);

			while (e.hasMoreElements()) {

				System.out.println(e.nextElement());

			}

		}

	}
