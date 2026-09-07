package ch14;

// 静的フィールドmoneyへのアクセス

public class Main3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Hero h1 = new Hero();
		Hero h2 = new Hero();
		
		// インスタンスh1の箱hpを表示
		System.out.println(h1.hp);
		
		// クラスHeroの箱moneyを表示
		System.out.println(Hero.money);
	}

}
