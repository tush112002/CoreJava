package TestEmp;

public class Employee {
	public @interface PermanentEmployee {
	}

	public class ConsultantEmployee {

	}

	protected int id;
	protected String name;
	protected double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void calculateSalary() {
		salary = 0;
	}

	public void display() {
		System.out.println("Employee ID: " + id);
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Salary: " + salary);
	}
}
