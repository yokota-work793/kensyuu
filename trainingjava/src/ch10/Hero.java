package ch10;

import ch8.Matango;

//継承
public class Hero {

	String name = "ミナト";
	public int hp = 100;
	
	// 戦う
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		
		m.hp -= 5;
		System.out.println("5ポイントのダメージをあたえた！");
	}
	
	public final void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は転んだ!");
		System.out.println("5のダメージ");
	}
	
	// 逃げる
	public void run() {
		System.out.println(this.name + "は逃げ出した！");
	}
}

//クラス宣言にfinalを付けると、継承を禁止できる