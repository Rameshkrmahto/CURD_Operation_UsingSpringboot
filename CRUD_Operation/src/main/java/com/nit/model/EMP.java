package com.nit.model;

import lombok.Data;


public class EMP {
	
	private Long empNo;
	
	private String name;
	
	private int deptno;
	
	private double salary;

	public EMP(Long empNo, String name, int deptno, double salary) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.deptno = deptno;
		this.salary = salary;
	}


	

	public Long getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Long empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	@Override
	public String toString() {
		return "EMP [empNo=" + empNo + ", name=" + name + ", deptno=" + deptno + ", salary=" + salary + "]";
	}

	

}
