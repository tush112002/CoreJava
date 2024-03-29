package TestEmp;

public class Main {
	public static void main(String[] args) {
		PermanentEmployee permanentEmployee = new PermanentEmployee(1, "Tush", 55000);
		permanentEmployee.calculateSalary();
		permanentEmployee.display();

		System.out.println();

		ConsultantEmployee consultantEmployee = new ConsultantEmployee(2, "Vaibhav", 40, 300);
		consultantEmployee.calculateSalary();
		consultantEmployee.display();
	}
}