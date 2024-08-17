package com.cdac.tranning.springcore.model;

public class Employee {
	private  int empId;
	private String empName;
	private double emSalary;
	public Employee(int empId, String empName, double emSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.emSalary = emSalary;
	}
//	public void display()
//	{
//		System.out.println("Employee [empId=" + empId + ", empName=" + empName + ", emSalary=" + emSalary + "]");
//	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", emSalary=" + emSalary + "]";
	}
//	
	

}
