package ch9;

public class Hero {

	String name;
	int hp;
	
	//勇者が装備している剣の情報
	Sword sword;
	public void attack() {
		
		System.out.println(this.name + "は" + this.sword.name + "で攻撃した！");
		System.out.println("敵に5ポイントのダメージをあたえた！");
		
	}
	
	//「newされた直後に自動的に実行される処理」を書いたメソッド
	public Hero(String name) {
		//hpフィールドを100で初期化
		this.hp = 100;
		this.name = name;
		
	}
	
	// コンストラクタのオーバーロード
	// 新しく作ったコンストラクタ
	public Hero() {
		this.hp = 100;
		this.name = "ダミー";
		
		//コンストラクタ①を呼び出すようJVMに依頼する場合
		// this("ダミー");
	}
}
