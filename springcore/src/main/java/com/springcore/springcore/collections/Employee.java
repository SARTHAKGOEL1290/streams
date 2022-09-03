package com.springcore.springcore.collections;

import java.util.Map;
import java.util.Set;

public class Employee {
	
	private String employeeName;
	private Manager ob;
	
	public Manager getOb() {
		return ob;
	}
	public void setOb(Manager ob) {
		this.ob = ob;
	}
	private Set<String>empCode;
	private Map<String,String> salaryInfo;
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Set<String> getEmpCode() {
		return empCode;
	}
	public void setEmpCode(Set<String> empCode) {
		this.empCode = empCode;
	}
	public Map<String, String> getSalaryInfo() {
		return salaryInfo;
	}
	public void setSalaryInfo(Map<String, String> salaryInfo) {
		this.salaryInfo = salaryInfo;
	}
	
	public Employee(String employeeName, Manager ob, Set<String> empCode, Map<String, String> salaryInfo) {
		super();
		this.employeeName = employeeName;
		this.ob = ob;
		this.empCode = empCode;
		this.salaryInfo = salaryInfo;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", ob=" + ob + ", empCode=" + empCode + ", salaryInfo="
				+ salaryInfo + "]";
	}
	
	

}
