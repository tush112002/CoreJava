package io;

import java.util.*;
import java.io.*;
import java.io.Serializable;

public class Employee implements Serializable {
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

	public void print() {
		System.out.println("Id: " + empId);
		System.out.println("Name: " + empName);
		System.out.println("Salary: " + empSalary);
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}

}
