package com.flipcard.demo;

import com.flipcad.bean.Employee;

public class DemoProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("demo started");
     
     Employee emp=new Employee();
     emp.setEmpId(101);
     emp.setEmpName("Employee Training");
     System.out.println(emp.getEmpId());
     System.out.println(emp.getEmpName());
	}

}
