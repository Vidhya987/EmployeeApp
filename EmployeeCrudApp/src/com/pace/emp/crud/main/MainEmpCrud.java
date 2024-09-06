package com.pace.emp.crud.main;
import com.pace.emp.crud.bean.Employee;
import com.pace.emp.crud.dao.EmployeeCrud;
public class MainEmpCrud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee kumar=new Employee(1234,"Prasanna Kumar",63254.21f);
		Employee prerana=new Employee(1235,"Prerana",96547.26f);
		Employee anirudh=new Employee(1236,"Anirudh",56321.21f);
		EmployeeCrud empCrud=new EmployeeCrud();
		//send emp objects to addEmployee method
		empCrud.addEmployee(anirudh);
		empCrud.addEmployee(prerana);
		empCrud.addEmployee(kumar);
		//display employee details
		empCrud.showEmpList();
		empCrud.deleteEmployee(1234);
		System.out.println("EmpList after Deleltion");
		empCrud.showEmpList();
		
		empCrud.updateEmployee();
		empCrud.showEmpList();
	
	}

}
