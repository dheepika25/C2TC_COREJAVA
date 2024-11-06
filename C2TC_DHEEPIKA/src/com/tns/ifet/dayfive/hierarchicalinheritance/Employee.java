package com.tns.ifet.dayfive.hierarchicalinheritance;

public class Employee extends Person{
	private int empId;
	private float salary;
	private String dept;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", salary=" + salary + ", dept=" + dept + ", getName()=" + getName() + ", getCity()=" + getCity() + "]";
	}
}

	

