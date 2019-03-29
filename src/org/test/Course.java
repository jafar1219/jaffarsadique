package org.test;

import differentPackage.Client;

public class Course {

	public void javacourse(){
	System.out.println("java course starts");
	}
	
	public void oracle(){
	System.out.println("oracle course starts");
	}
	
	public static void main(String[] args) {
		Course e=new Course();
		e.javacourse();
		e.oracle();
		Employee d=new Employee();
		d.EmpId();
		d.empName();
		Client c=new Client();
		c.clientloc();
		c.clientName();
	}
	
}
