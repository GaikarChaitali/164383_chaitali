package com.chaitali.rest.RestAssignment;

public class Employee {
	long employeeId;
	String employeeName, employeeDepartment, employeeDesignation;
	long employeeSalary;




/*POJO*/
	public Employee(){

	}


	public Employee(long employeeId, String employeeName,
			String employeeDepartment, String employeeDesignation,
			long employeeSalary) {

		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDepartment = employeeDepartment;
		this.employeeDesignation = employeeDesignation;
		this.employeeSalary = employeeSalary;
	}
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeDepartment() {
		return employeeDepartment;
	}
	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}
	public String getEmployeeDesignation() {
		return employeeDesignation;
	}
	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}
	public long getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(long employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName="
				+ employeeName + ", employeeDepartment=" + employeeDepartment
				+ ", employeeDesignation=" + employeeDesignation
				+ ", employeeSalary=" + employeeSalary + "]";
	}



}
