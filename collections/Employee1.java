package com.rays.collections;

public class Employee1 {
	

		private int id = 0;
		private String name = null;
		private int salary = 0;

		public Employee1(int id, int salary, String name) {
			this.id = id;
			this.name = name;
			this.salary = salary;
		}

		public int getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public int getSalary() {
			return salary;
		}

		@Override
		public String toString() {
			return id + " " + salary + " " + name;
		}
		
	}



