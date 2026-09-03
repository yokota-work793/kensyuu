package ch8;

// HeroクラスをJavaのコードで表す

public class Hero {
	
	// 名前の宣言
	String name;
	
	// HPの宣言
	int hp;
	
	// 「眠る」操作に含まれる要素を記述
	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した!");
	}

	// 「座る」操作を記述
	public void sit(int sec) {
		this.hp += sec;
		System.out.println(
				this.name + "は、" + sec + "秒座った！");
		System.out.println(
				"HPが" + sec + "ポイント回復した");
	}
	
	// 「転ぶ」操作を記述
	public void slip() {
		this.hp -= 5;
		System.out.println(
				this.name + "は、転んだ！");
		System.out.println(
				"5のダメージ！");
	}
	
	// 「逃げる」操作を記述
	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした");
	}
}
