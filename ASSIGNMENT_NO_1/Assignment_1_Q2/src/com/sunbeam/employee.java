package com.sunbeam;

public class employee{
	
	private int empid;
	private String name;
	private double sal;
	
	
	public employee(int empid, String name, double sal) {
		//super();
		this.empid = empid;
		this.name = name;
		this.sal = sal;
	}


	public employee() {
		// TODO Auto-generated constructor stub
	}


	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSal() {
		return sal;
	}


	public void setSal(double sal) {
		this.sal = sal;
	}


	@Override
	public String toString() {
		return "employee [empid=" + empid + ", name=" + name + ", sal=" + sal + "]";
	}
	
	
	
	

}
