package ch17;

// 例外インスタンスを自分で投げる

public class Main7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Person p = new Person();
		// 誤った値のセットを試みる -> 例外発生
		p.setAge(-128);
	}
}
