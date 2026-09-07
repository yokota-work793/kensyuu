package ch14;

// インスタンスから静的フィールドを利用する

public class Main4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// newしなくても静的フィールドは利用できる
		Hero h1 = new Hero();
		Hero h2 = new Hero();
		Hero.money = 100;
		
		// 100と表示
		System.out.println(Hero.money);
		
		// 100と表示
		System.out.println(h1.money);
		
		// h1.moneyに300を代入
		h1.money = 300;
		
		// h2.moneyでも300と表示
		System.out.println(h2.money);
	}
}
