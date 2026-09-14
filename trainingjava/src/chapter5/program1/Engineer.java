package chapter5.program1;

public class Engineer extends Employee {
	
	String language;
	
	public Engineer(String name, String department, String language) {
		super(name, department);
		this.language = language;
	}
	
	public void development() {
		System.out.println(language + "で開発を行った");
	}

	@Override
	public void displayInformation() {
		System.out.println(getName() + "：" + getDepartment() + " 使用言語：" + language);
	}
	
	public String getLanguage() {
		return language;
	}
}
