package ch8;

public class Main2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 1.勇者を生成し、初期値セット
		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;

		// 2.お化けキノコAを生成し、初期値セット
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';
		
		// 3.お化けキノコBを生成し、初期値セット
		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';
		
		// 4.冒険のはじまり
		h.slip();
		m1.run();
		m2.run();
		h.run();
	}
}
