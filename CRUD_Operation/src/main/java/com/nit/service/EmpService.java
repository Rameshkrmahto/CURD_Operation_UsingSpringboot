package com.nit.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.dao.DAOEmp;
import com.nit.model.EMP;

@Service
public class EmpService {
	
	@Autowired
	DAOEmp daoEMp;
	
	public String insertService(EMP e)
	{
		int result=daoEMp.insert(e);
		
		return result==0?"Not Inserted Successfully":"Inserted Successfully";
	}
	
	public List<EMP> displayService() throws SQLException
	{
		List<EMP> list = daoEMp.display();
		
		list.forEach(s->System.out.println(s));
		
		return list;
	}

	public String insertDelete(int e) throws SQLException
	{
		int result=daoEMp.delete(e);
		
		return result==0?"Not Delete Inserted Successfully":"Delete Inserted Successfully";
	}
	
	public String inserUpdate(long emp,double sal) throws SQLException
	{
		int result=daoEMp.udateQuery(emp, sal);
		
		return result==0?"Not Updated Successfully":"Updated Successfully";
	}
}
