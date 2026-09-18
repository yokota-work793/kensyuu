package 実装力チェックテスト05;

import java.util.ArrayList;
import java.util.List;

public class BT {

	private String companyName = "BT";

	private List<Employee> employeeList = new ArrayList<Employee>();
	private List<String> departmentList = new ArrayList<String>();

	public BT() {
		departmentList.add("人事");
		departmentList.add("営業");
		departmentList.add("エンジニア");
	}

	// 従業員作成
	public void createEmployee(String name, String department, String language) {

		// employeeの箱　部署に応じてどれかを入れる
		Employee employee = null;

		// thisは現在のBTオブジェクト
		if (department.equals("人事")) {
			employee = new HumanResource(name, department, this);

		} else if (department.equals("営業")) {
			employee = new Sales(name, department);

		} else if (department.equals("エンジニア")) {
			employee = new Engineer(name, department, language);
		}

		// 従業員リストを作成
		employeeList.add(employee);
	}

	// 従業員情報表示
	public void displayAllEmployees() {
		for (Employee employee : employeeList) {
			employee.displayInformation();
		}
	}
}