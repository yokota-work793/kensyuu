package ch10;

public class Matango2 {

	public int hp = 50;
	public char suffix;
	public Matango2(char suffix) {
		this.suffix = suffix;
	}
	
	public Matango2(int i) {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void attack(Hero h) {
		System.out.println("キノコ" + this.suffix + "の攻撃");
		System.out.println("10のダメージ");
		h.hp -= 10;
	}
}
