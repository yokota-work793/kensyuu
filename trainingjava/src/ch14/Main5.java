package ch14;

// newしなくても静的メソッドは呼び出せる

public class Main5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Hero.setRandomMoney();
		// ランダムな金額を表示
		System.out.println(Hero.money);
		
		Hero h1 = new Hero();
		// 同じ金額を表示
		System.out.println(h1.money);

	}

}
