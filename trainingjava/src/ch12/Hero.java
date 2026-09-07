package ch12;

public class Hero extends Character {

	@Override
	public void attack(Monster m) {
		// TODO 自動生成されたメソッド・スタブ
		
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に10ポイントのダメージをあたえた！");
		m.hp -= 10;

	}

}
