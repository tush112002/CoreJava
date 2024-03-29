package sorting;

import java.util.Comparator;

public class EmployeeSalarySorting implements Comparator<Employee> {
	
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.empSalary > o2.empSalary ) {
			return 1;
		}
		else if(o1.empSalary < o2.empSalary ) {
			return -1;
		}
		else {
			return 0;
		}
	}

}
