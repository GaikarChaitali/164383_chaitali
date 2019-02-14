package com.chaitali.project.AssignmentFolder;

import javax.security.auth.Destroyable;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee /*implements InitializingBean, DisposableBean*/ {
	String eName;
	int empId;
	double salary;
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eName=" + eName + ", empId=" + empId + ", salary="
				+ salary + "]";
	}
	/*@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Init block has been executed");
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Destroy method has been executed");
	}
*/

	public void init(){
		System.out.println("initialization");
	}
	
	public void destroy(){
		System.out.println("end of bean");
	}
	
}
