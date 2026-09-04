package ch11;

import ch8.Matango;

// 抽象クラス

// 抽象メソッドを含むクラスの宣言
// public abstract class クラス名 {
public abstract class Character {

	String name;
	int hp;
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
	// 詳細未定のメソッド（抽象メソッド）を宣言 
	// public abstract 戻り値の型 メソッド名（引数リスト）;	
	public abstract void attack(Matango m);
		
}
