package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nit.model.Employee;
import com.nit.service.IEmployeeService;

@Controller("econtroller")
public class ControllerEmployee {
	
	@Autowired
	private IEmployeeService service;
	
	public List<Employee> showAllEmployeeByDesgs(String desg1, String desg2, String desg3) throws Exception
	{
		List<Employee> list =service.fetchAllEmployeeByDesgs(desg1, desg2, desg3);
		System.out.println("Controller Class");
		
		return list;
	}
	
	public String processEmployee(Employee emp) throws Exception
	{
		String msg=service.registerEmployee(emp);
		
		return msg;
				
	}

}
