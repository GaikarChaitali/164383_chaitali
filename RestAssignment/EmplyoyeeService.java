package com.chaitali.rest.RestAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EmplyoyeeService {

	 Map<Long , Employee> employee=EmployeeDAO.getEmployee();
	
    public EmplyoyeeService() {
			employee.put((long) 123, new Employee(123, "chaitali", "it", "manager", 20000));
			employee.put((long) 123, new Employee(123, "komal", "it", "hr", 35000));
			employee.put((long) 123, new Employee(123, "ankita", "comp", "headHr", 50000));
		}
		
		

		/*// Add employee
		public Employee addEmployee(Employee employee){	
			employee.setId(employee.size() + 1);
			employee.put(employee.getId(), employee);
			return employee;
		}*/
		
		/*//Search employee by id
		public Employee getEmployee(Employee newEmp){	
			Employee obj=null;
			obj=employee.get(newEmp);
			
			return obj;
		}*/
		
		/*
		//delete employee
		public Employee removeEmployee(long id) {
			return employee.remove(id);
		}*/
		
		//get all employee
		public List<Employee> getAllEmployee(){		
			return new ArrayList<Employee>(employee.values());
		}
		
		
		//editing employee
		
		
		/*public Employee update(long id,long salary) {
			
			Employee obj=getEmployee(id);
			obj.setEmployeeSalary(salary);
			removeEmployee(id);
			employee.put(id, obj);
			return obj;	
			
			
		}*/
}
