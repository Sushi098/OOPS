package com.rays.collections;

import java.util.Comparator;

public class OrderById implements Comparator<EmployeeComparable> {
	
		@Override
		public int compare(EmployeeComparable o1, EmployeeComparable o2) {
			return o1.getId() - o2.getId();
		}

	}

	class OrderByNameAsc implements Comparator<EmployeeComparable>{

		@Override
		public int compare(EmployeeComparable o1, EmployeeComparable o2) {
			
			return o1.getName().compareTo(o2.getName());
		}
		
	}

	class OrderByNameDsc implements Comparator<EmployeeComparable>{

		@Override
		public int compare(EmployeeComparable o1, EmployeeComparable o2) {
			
			return o2.getName().compareTo(o1.getName());
		}
		
	}

class OrderBySalary implements Comparator<EmployeeComparable> {
	
	@Override
	public int compare(EmployeeComparable o1, EmployeeComparable o2) {
		return o1.getSalary() - o2.getSalary();
	}

}

