package com.deloitte.java.models;

import java.io.Serializable;

public class Employee2 implements Serializable{
	private int empid;
	private String ename;
	private double salary;
	
	public Employee2(){}

	public Employee2(int empid, String ename, double salary){
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
	}
	
	public void setEmpid(int empid){
		this.empid = empid;
	}
	
	public void setEname(String ename){
		this.ename = ename;
	}
	
	public void setSalary(double salary){
	this.salary = salary;
	}
	
	public int getEmpid(){
		return empid;
	}
	
	public String getEname(){
		return ename;
	}
	
	public double getSalary(){
		return salary;
	}
	
	 @Override
    public boolean equals(Object o) { 
        if (o == this) 
            return true; 
  
        if (o == null || o.getClass() != this.getClass()) 
            return false; 
		
        Employee2 c = (Employee2) o; 
        return empid == c.empid;
    } 
	
	 @Override
    public int hashCode() { 
        return this.empid; 
    } 
		public String toString() {
			return  "\n Name        = " + ename + 
					"\n Empid       = " + empid + 
					"\n Salary      = " + salary;
		}
}