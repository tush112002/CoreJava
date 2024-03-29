package sorting;

public class Employee implements Comparable<Employee> {
	int empId;
	String empName;
	double empSalary;

	Employee() {

	}

	public Employee(int empId, String empName, double empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}

	public int compareTo(Employee e) {

		if (this.empId > e.empId) {
			return 1;
		} else if (this.empId < e.empId) {
			return 1;
		} else {
			return 0;
		}
	}

}
