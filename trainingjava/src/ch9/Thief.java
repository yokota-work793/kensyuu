package ch9;

public class Thief {

	String name;
	int hp;
	int mp;
	
	//名前・HP・MPをすべて指定する
	public Thief(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	
	//MPは5にする
	public Thief(String name, int hp) {
		this(name, hp, 5);
	}
	
	//HPは40、MPは5にする
	public Thief(String name) {
		this(name, 40, 5);
	}
	
}
