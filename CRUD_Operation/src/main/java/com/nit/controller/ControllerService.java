

package com.nit.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nit.model.EMP;
import com.nit.service.EmpService;

@Controller
public class ControllerService {
	
	@Autowired
	EmpService empService;
	
	public void insertController(EMP e) throws SQLException
	{
		System.out.println(empService.insertService(e));
	}
	
	public void udateEmpl() throws SQLException
	{
	empService.displayService();
	}
	
	public void deleteEmp(int e) throws SQLException
	{
		System.out.println(empService.insertDelete(e));
	}
	
	public void updateController(long emp,double sal) throws SQLException
	{
		System.out.println(empService.inserUpdate(emp, sal));
	}

}
