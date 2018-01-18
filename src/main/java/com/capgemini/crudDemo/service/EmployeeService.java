package com.capgemini.crudDemo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.crudDemo.beans.Employee;
import com.capgemini.crudDemo.exceptionHandler.EmplyeeNotFoundException;

@Service
public class EmployeeService {
	List<Employee> empList =  Arrays.asList(new Employee("Richa","1"),new Employee("Mayur","2"),new Employee("Mallika","3"));
		
	public List<Employee> getAllEmp(){		
		return empList;
	}
	
	public List<Employee> addEmp (Employee emp){
		empList.add(emp);
		return empList;
	}
	
	public Employee getEmp(String id){
		this.validateInput(id);		
		return empList.stream().filter(emp -> emp.getId().equals(id)).findFirst().get();
	}
	
	public List<Employee> updateEmp (String empId,Employee emp){
		int eid= Integer.parseInt(empId);
		empList.set(eid - 1, emp);
		return empList;
	}
	
	public List<Employee> deleteEmp (Employee emp){
		empList.remove(emp);
		return empList;
	}
	
	public void validateInput(String id){
		int eid = Integer.parseInt(id);
		if(eid < 0){
			throw new EmplyeeNotFoundException("invalid Id Input");
		}
	}
}
