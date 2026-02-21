package com.nit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nit.model.EMP;

@Repository
public class DAOEmp {
	
	
	private final String insertQuery="INSERT INTO EMP(EMPNO,ENAME,DEPTNO,SAL) VALUES(?,?,?,?)";
	
	private final String display="SELECT EMPNO, ENAME, DEPTNO, SAL FROM EMP";
	
	private final String deleteQuery="DELETE FROM EMP WHERE EMPNO=?";
	
	String update="Update EMP set sal=? where empno=?";
	
	@Autowired
	private  DataSource ds=null;
	
	public int  insert(EMP e)
	{
		int result=0;
		try(Connection con=ds.getConnection();
				PreparedStatement pstm=con.prepareStatement(insertQuery))
		{
			pstm.setLong(1, e.getEmpNo());
			pstm.setString(2, e.getName());
			pstm.setInt(3, e.getDeptno());
			pstm.setDouble(4, e.getSalary());
			
			result=pstm.executeUpdate();
				
		}
		
		catch(SQLException e2)
		{
			e2.printStackTrace();
		}
		
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
		return result;
	}
	
	public List<EMP> display() throws SQLException
	{
		List<EMP> list=new ArrayList<>();
		
		try(Connection con=ds.getConnection();
				PreparedStatement pstm=con.prepareStatement(display);
						ResultSet rs=pstm.executeQuery())
		{
			while(rs.next())
			{
				EMP emp=new EMP(rs.getLong(1),rs.getString(2),rs.getInt(3),rs.getDouble(4));
				
				list.add(emp);
			}
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return list;
	}
	
	public int delete(int e) throws SQLException
	{
		int resultDelete=0;
		try(Connection con=ds.getConnection();
				PreparedStatement pstm=con.prepareStatement(deleteQuery))
		{
			pstm.setLong(1, e);
			
			 resultDelete = pstm.executeUpdate();
		}
		
		catch(Exception e4)
		{
			e4.printStackTrace();
		}
		
		return resultDelete;
	}
	
	public int udateQuery(long empno,double sal)
	{
		
		int result=0;
		try(Connection con=ds.getConnection();
				PreparedStatement pstm=con.prepareStatement(update))
		{
			pstm.setDouble(1, sal);
			pstm.setLong(2, empno);
			
			
			
			result=pstm.executeUpdate();
				
		}
		
		catch(SQLException e2)
		{
			e2.printStackTrace();
		}
		
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
		return result;
		
	}
	

}
