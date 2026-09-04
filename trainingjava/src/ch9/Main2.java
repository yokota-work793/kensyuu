package ch9;

// Heroクラスをインスタンス化し利用する
public class Main2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
Sword s = new Sword();
s.name = "炎の剣";
s.damage = 10;

Hero h1 = new Hero();
h1.name = "ミナト";
h1.hp = 100;
h1.sword = s;
h1.attack();
System.out.println("現在の武器は" + h1.sword.name);
		
Hero h2 = new Hero();
h2.name = "アサカ";
h2.hp = 100;

Wizard w = new Wizard();
w.name = "スガワラ";
w.hp = 50;

// ミナトを回復させる（HP:100 -> 110）
w.heal(h1);
// アサカを回復させる（HP:100 -> 110）
w.heal(h2);
// アサカを回復させる（HP:110 -> 120）
w.heal(h2);
	
	}

}
