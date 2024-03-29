package sorting;

import java.util.*;

public class TestEmployee {
    public static void main(String[] args) {
    	
		Employee e1 = new Employee(1,"ABC",10000.0);
		Employee e2 = new Employee(4,"XYZ",20000.0);
		Employee e3 = new Employee(9,"UVW",100000.0);
		Employee e4 = new Employee(12,"NOP",40000.00);
		
		List<Employee> employee = new ArrayList<>();
		employee.add(e1);
		employee.add(e2);
		employee.add(e3);
		employee.add(e4);

		System.out.println("Employees are Sorted on the basis of Id's:");
		Collections.sort(employee);
		System.out.println(employee);
		
		System.out.println("Employees are Sorted on the basis of Salaries:");
		Collections.sort(employee, new EmployeeSalarySorting());
		System.out.println(employee);
		
		Comparator<Employee> empsalarysort = (o1,o2) ->{
			if(o1.empSalary > o2.empSalary ) {
				return -1;
			}
			else if(o1.empSalary < o2.empSalary ) {
				return 1;
			}
			else {
				return 0;
			}
		};
		
		System.out.println("Employees are Sorted on the basis of Salaries using lambda function:");
		Collections.sort(employee, new EmployeeSalarySorting());
		System.out.println(employee);
	}
}
