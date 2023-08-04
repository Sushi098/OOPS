package com.rays.collections;

public class TestEqualsHashcode {
	
		public static void main(String[] args) {
			
			Employee1 e1 = new Employee1(1, 15000, "kanak");
			
			Employee1 e2 = new Employee1(2, 25000, "devendra");
			
			Employee1 e3 = new Employee1(3, 55000, "mahi");
			
			String s = "java";
			
			System.out.println(e1.equals(s));
			
			System.out.println(e1.hashCode());
			
			System.out.println(e2.hashCode());
			
			System.out.println(e3.hashCode());

		}

	}




