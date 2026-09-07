package ch12;

public class Main3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Monster[] monsters = new Monster[3];
		monsters[0] = new Slime();
		monsters[1] = new Goblin();
		monsters[2] = new DeathBat();
		
		for (Monster m : monsters) {
			m.run();
		}
	}

}
