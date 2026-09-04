package ch9;

// Heroクラスをインスタンス化し利用する
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		/*		
		Hero h1;
		h1 = new Hero();
		h1.hp = 100;
		
		Hero h2;
		//h1とh2は同じもの
		h2 = h1;
		h2.hp = 200;
		*/
		
		Hero h1 = new Hero("ミナト");
		
		System.out.println(h1.hp);
		System.out.println(h1.name);
		
		Hero h2 = new Hero();
		System.out.println(h2.name);
		
	}

}
