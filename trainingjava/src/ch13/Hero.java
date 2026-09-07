package ch13;

import ch10.Matango2;
import ch9.Sword;

// hpフィールドをprivateにしたHeroクラス
public class Hero {

	private int hp;
	private String name;
	Sword sword;
	
	public void bye() {
		System.out.println("勇者は別れを告げた");
	}
	
	private void die() {
		System.out.println(this.name + "は死んでしまった！");
		System.out.println("GAME OVERです。");
	}
	
	void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は眠って回復した！");
	}
	
	public void attack(Matango2 m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("お化けキノコ" + m.suffix + "から2ポイントの反撃を受けた");
		this.hp -= 2;
		if (this.hp <= 0 ) {
			this.die();
		}
	}
	
	public String getName() {
		return this.name;
	}
	
	// setterメソッドで値の妥当性をチェックする
	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException(
					"名前がnullである。処理を中断。");
		}
		
		if (name.length() <= 1) {
			throw new IllegalArgumentException(
					"名前が短すぎる。処理を中断。");
		}
		
		if (name.length() >= 8) {
			throw new IllegalArgumentException(
					"名前が長すぎる。処理を中断。");
		}
		this.name = name;
	}
}
