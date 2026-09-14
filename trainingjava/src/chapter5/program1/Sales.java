package chapter5.program1;

public class Sales extends Employee {
	
	public Sales(String name, String department) {
		super(name, department);
	}
	
	public void replyWeeklyReport() {
		System.out.println("通報の返信をした");
	}
	
	public void scheduleMeeting(Engineer engineer) {
		System.out.println(engineer.getName() + "の面談を組んだ");
	}
	
	public void meeting() {
		System.out.println("新規の打ち合わせをした");
	}
	
	@Override
	public void displayInformation() {
		System.out.println(getName() + "：" + getDepartment());
	}

}
