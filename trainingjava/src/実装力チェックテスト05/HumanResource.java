package 実装力チェックテスト05;

public class HumanResource extends Employee {
	
	// 従業員作成をアクセス可能にするために、BTオブジェクトを持たせる。
	private BT bt;
	
	public HumanResource(String name, String department, BT bt) {
		super(name, department);
		this.bt = bt;
	}
	
	// 社員面接
	public void interview(boolean hired) {
		if (hired) {
			System.out.println("面接を行い、結果は採用だった");
			
			bt.createEmployee(getName(), getDepartment(), getDepartment());
			
		} else {
			System.out.println("面接を行い、結果は不採用だった");
		}
	}
	
	// 給与計算
	public void calcurateSalary() {
	}
	
	// 情報表示
	public void displayInformation() {
		System.out.println(getName() + "：" + getDepartment());
	}

}
