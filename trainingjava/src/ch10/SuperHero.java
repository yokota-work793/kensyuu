package ch10;

import ch8.Matango;
// ch8にpublicをつける（別のパッケージにあるクラスからも使えるようにする）

//Heroクラスを継承してSuperHeroを作成する
public class SuperHero extends Hero {

	//追加したflying
	boolean flying;

	//追加したfly()
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
	}

	//追加したland()
	public void land() {
		this.flying = false;
		System.out.println("着地した！");
	}

	public void run() {
		System.out.println(this.name + "は撤退した");
	}

	// attack()をオーバーライドしたSuperHero
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃!");
		m.hp -= 5;
		System.out.println("5ポイントのダメージをあたえた！");

		// 空を飛んでいる状態でのみ、2回攻撃できる
		if (this.flying) {
			System.out.println(this.name + "の攻撃！");
		m.hp -= 5;
			System.out.println("5ポイントのダメージをあたえた！");
		}
	}
}

	/*
	String name = "ミナト";
	int hp = 100;
	
	// 戦う
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		
		m.hp -= 5;
		System.out.println("5ポイントのダメージをあたえた！");
	}
	
	// 逃げる
	public void run() {
		System.out.println(this.name + "は逃げ出した！");
		
		// 飛ぶ
		public void fly() {
			this.flying = true;
			System.out.println("飛び上がった！");
		}
		
		// 着地する
		public Void land() {
			this.flying = false;
			System.out.println("着地した！");
		*/

