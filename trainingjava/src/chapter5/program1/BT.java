package chapter5.program1;

import java.util.ArrayList;
import java.util.List;

public class BT {
	
	private String companyNameString = "BT";
	
	private List<Employee> employeeList = new ArrayList<>();
	private List<String> departmentList = new ArrayList<>();
	
	
	public BT() {
		departmentList.add("人事");
		departmentList.add("営業");
		departmentList.add("エンジニア");
	}
	
	public void createEmployee(
			String name,
			String department,
			String language) {
		
		Employee employee;
		
		if (department.equals("人事")) {			
			employee = new HumanResource(name, department,this);
			
		} else if (department.equals("営業")) {
			employee = new Sales(name, department);
			
		} else if (department.equals("エンジニア")) {
			employee = new Engineer(name, department, language);
			
		} else {
			System.out.println("存在しない部署です");
			return;
		}
	
		employeeList.add(employee);
	}
	
	public void displayAllEmployees() {
		for (Employee employee : employeeList) {
			employee.displayInformation();
		}
	}

}
