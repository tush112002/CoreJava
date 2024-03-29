package TestEmp;

public class ConsultantEmployee extends Employee {
	private int hrs;
	private double perHour;

	public ConsultantEmployee(int id, String name, int hrs, double perHour) {
		super(id, name, 0);
		this.hrs = hrs;
		this.perHour = perHour;
	}

	public void calculateSalary() {
		salary = hrs * perHour;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Hours Worked: " + hrs);
		System.out.println("Per Hour Rate: " + perHour);
	}
}
