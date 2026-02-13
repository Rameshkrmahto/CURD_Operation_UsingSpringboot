package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.dao.IEmployeeDAO;
import com.nit.model.Employee;

@Service("empService")
public class EmployeeServiceImp implements IEmployeeService {

	@Autowired
	private IEmployeeDAO dao;
	
	@Override
	public List<Employee> fetchAllEmployeeByDesgs(String desg1, String desg2, String desg3) throws Exception {
		
		desg1=desg1.toUpperCase();
		desg2=desg2.toUpperCase();
		desg3=desg3.toUpperCase();
		List<Employee> list =dao.getEmployeeByDesgs(desg1, desg2, desg3);
		
	
		list.forEach(emp -> {
			
	        emp.setGrossSalary(emp.getSalary() * 1.15);
	        emp.setNetSalary(emp.getGrossSalary() - (emp.getGrossSalary() * 0.1)); 
	    });
		
		System.out.println("Service Class");
		
		return list;
	}

	@Override
	public String registerEmployee(Employee emp) throws Exception {
		
		int result =dao.insertEmployee(emp);
		
		return result==0?"Employee not register":"Employee is registered";
	}

}
