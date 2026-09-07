package ch12;

public class Main2 {

	public static void main(String[] args) {
		
		// 多態性と配列を組み合わせて宿屋に泊まる
		
		Character[] c = new Character[5];
		c[0] = new Hero();
		c[1] = new Hero();
		c[2] = new Thief();
		c[3] = new Wizard();
		c[4] = new Wizard();
		
		for (Character ch : c) {
			ch.hp += 50;
		}
	}
}		
		/*
		 * 従来の書き方
		Hero h1 = new Hero();
		Hero h2 = new Hero();
		Thief t1 = new Thief(null);
		Wizard w1 = new Wizard();
		Wizard w2 = new Wizard();
		
		h1.hp += 50;
		h2.hp += 50;
		t1.hp += 50;
		w1.hp += 50;
		w2.hp += 50;
		*/

