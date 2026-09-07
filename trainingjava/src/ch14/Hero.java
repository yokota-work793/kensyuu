package ch14;

public class Hero {

	String name;
	int hp;
	// staticによるフィールドの共有　静的フィールド
	static int money;
	
	// 意図する文字列表現を返すtoString()を定義
	public String toString() {
		return "名前：" + this.name + "/HP：" + this.hp;
	}
	
	// 名前が同じなら同じ勇者とするequals()を定義
	public boolean equals(Object o) {
		if (this == o) {return true;}
		if (o instanceof Hero h) {
			if (this.name.equals(h.name)) {
				return true;
			}
		}
		return false;
	}
	
	// 所持金をランダムに設定する
	public static void setRandomMoney() {
		Hero.money = (int)(Math.random() * 1000);
		// System.out.println(this.name + "たちの所持金を初期化しました");
		// staticのコンテキストではthisを使用しない　→　エラーになる
	}
}
