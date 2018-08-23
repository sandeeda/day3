package com.sandeep.day3;

public class Employee {

	public static final double PT=200;
	private double basicSalary;
	private double hra;
	private double pf;
	private double grossSalary;
	private double netSalary;
	private double medical;
	private long employeeId;
	private String empName;
	
	
	public Employee()
	{
		
	}
	
	public Employee(String empName, long empId, double basic,double medical)
	{
		this.basicSalary=basic;
		this.medical=medical;
		this.empName = empName;
		this.employeeId = empId;
	}
	
	
	public double calculateNetSalary() {
		
		hra = basicSalary*0.5;
		pf = 0.12*basicSalary;
		grossSalary = hra+basicSalary+medical;
		
		
		netSalary=grossSalary-(pf+PT);
		displayEmployeeDetails();
		return netSalary;
	}
	
	
	public void displayEmployeeDetails()
	{
		System.out.println("Employee name: "+empName);
		System.out.println("Employee ID: "+employeeId);
		System.out.println("Net Salary: "+netSalary);
		
	}
	
	
	
}
