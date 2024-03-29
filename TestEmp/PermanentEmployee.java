package TestEmp;

public class PermanentEmployee extends Employee {
	private double hra;
	private double da;
	private double ta;
	private double basicSalary;

	public PermanentEmployee(int id, String name, double basicSalary) {
		super(id, name, basicSalary);
		this.hra = basicSalary * 0.20;
		this.da = basicSalary * 0.25;
		this.ta = basicSalary * 0.10;
		this.basicSalary = basicSalary;
	}

	@Override
	public void calculateSalary() {
		salary = basicSalary + hra + da + ta;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("HRA: " + hra);
		System.out.println("DA: " + da);
		System.out.println("TA: " + ta);
		System.out.println("Basic Salary: " + basicSalary);
	}
}
