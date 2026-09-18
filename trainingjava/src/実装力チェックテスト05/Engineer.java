package 実装力チェックテスト05;

public class Engineer extends Employee {
	
	private String language;
	
	public Engineer(String name, String department, String language) {
		super(name, department);
		this.language = language;
	}
	
	public String getLanguage() {
		return language;
	}
	
	// 開発実施
	public void development() {
		System.out.println(language + "で開発を行った");
	}
	
	// 情報表示
	public void displayInformation() {
		System.out.println(getName() + "：" + getDepartment() + " 使用言語：" + language);
	}

}
