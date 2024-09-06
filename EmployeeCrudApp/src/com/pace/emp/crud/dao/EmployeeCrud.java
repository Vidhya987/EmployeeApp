package com.pace.emp.crud.dao;

import java.util.ArrayList;

import com.pace.emp.crud.bean.Employee;
public class EmployeeCrud {
	ArrayList<Employee>empList=new ArrayList<Employee>();
	//addition
	public void addEmployee(Employee emp)  {
		empList.add(emp);
	}
	public void showEmpList() {
		for(Employee emp:empList){
			System.out.println(emp.getId());
			System.out.println(emp.getName());
			System.out.println(emp.getSalary());
			System.out.println("======================================");
		}
	}
	//update employee salary by 10%
	//to retrive we use get salary
	//to update we use set salary
	public void updateEmployee() {
		for(Employee emp:empList) {
			float salary=emp.getSalary();
			salary=salary+(salary*10/100);
			emp.setSalary(salary);
	System.out.println("Salary has been Upadted:");
	//for particular if(emp=getId()) then update
		}
	}
	//to delete
	//before deleteing the object ensure that object is avaliable 
	//if the object is not avaliable provide a relevent measaage to the end user this kind of scenario is known as determination of avaliablity
	public void deleteEmployee(int id) {
		boolean isAvaliable=false;//naming convectiob is or has for boolean
		for(Employee emp:empList) {
			if(id==emp.getId()) {
				empList.remove(emp);
				isAvaliable=true;
				break;
			}
		}
		if(isAvaliable==true) {
			System.out.println("Employee with id "+id+" has been succesfully deleted");
		}
		else {
			System.out.println("Employee with id "+id+" is unavaliable");
		}
		
		
	}
}
