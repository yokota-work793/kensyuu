package chapter5.program1;

public class HumanResource extends Employee {
	
	private BT bt;
	
	public HumanResource(String name, String department, BT bt) {
		super(name, department);
		this.bt = bt;
	}
	
	public void interview(boolean hired, String employeeName, String departement, String language) {
		
		if (hired) {
			
			System.out.println("面接を行い、結果は採用だった");
			
			bt.createEmployee(employeeName, departement, language);
		} else {
			System.out.println("面接を行い、結果は不採用だった");
		}
	}
	
	public void calculateSalary() {
		System.out.println("給与計算を行った");
	}	
	
	@Override
	public void displayInformation() {
		System.out.println(getName() + "：" + getDepartment());
	}
}
