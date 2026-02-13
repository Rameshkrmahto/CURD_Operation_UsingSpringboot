package com.nit.model;





public class Employee {
	
	
	private Integer eno;
	private String ename;
	private String job;
	private Double salary;
	private Integer detpno;
	private Double grossSalary;
	private Double netSalary;
	
	
	public Integer getEno() {
		return eno;
	}
	public void setEno(Integer eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Integer getDetpno() {
		return detpno;
	}
	public void setDetpno(Integer detpno) {
		this.detpno = detpno;
	}
	public Double getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(Double grossSalary) {
		this.grossSalary = grossSalary;
	}
	public Double getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(Double netSalary) {
		this.netSalary = netSalary;
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", job=" + job + ", salary=" + salary + ", detpno="
				+ detpno + ", grossSalary=" + grossSalary + ", netSalary=" + netSalary + "]";
	}
	
	

}
