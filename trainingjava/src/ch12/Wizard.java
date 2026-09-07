package ch12;

import ch10.Matango2;

public class Wizard extends Character {
	
	int mp;
	
	public void attack(Matango2 m) {
		
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に3ポイントのダメージ");
		m.hp -= 3;
		
	}

	public void fireball(Matango2 m) {
		
		System.out.println(this.name + "は火の玉を放った！");
		System.out.println("敵に20ポイントのダメージ");
		m.hp -= 20;
		this.mp -= 5;
		
	}

	@Override
	public void attack(Monster m) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
}
