package ch11.training;

public class Computer extends TangibleAsset {
	
	String makerName;
	
	public Computer(String name, int price, String color, String makername) {
		super(makername, price, color);
		this.makerName = makername;
	}
	
	public String getMakerName() {
		return this.makerName;
	}

}
