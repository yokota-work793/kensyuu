package ch11;

import ch10.Matango2;
import ch8.Matango;

// 継承と実装を同時に行う

public class Fool extends Character implements Human {
	// Characterからhpやnameなどのフィールドを継承している
	// Characterから継承した抽象メソッドattack()を実装
	
	public void attack(Matango2 m) {
		System.out.println(this.name + "は戦わず遊んでいる");
	}
	
	// さらにHumanから継承した4つの抽象メソッドを実装
	public void talk() {}
	public void watch() {}
	public void hear() {}
	public void run() {}

	@Override
	public void attack(Matango m) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
}