package ch9;

public class Main3 {

	public static void heal(int hp) {
		hp += 10;
	}
	
	public static void heal(Thief thief) {
		thief.hp += 10;
	}
	
	public static void main(String[] args) {
		int baseHp = 25;
		Thief t = new Thief("アサカ", baseHp);
		
		heal(baseHp);
		System.out.println(baseHp + "：" + t.hp);
		
		heal(t);
		System.out.println(baseHp + "：" + t.hp);
	
	}

}

/*
実行結果は次の通りです。
25：25
25：35

最初の heal(baseHp) では、baseHp の値である 25 がメソッドの引数 hp にコピーされます。
int 型の変数は参照ではなく値そのものを扱うため、メソッド内で hp を 35 にしても、main メソッドの baseHp は 25 のままです。

次の heal(t) では、変数 t に入っているThiefインスタンスへの参照が、引数 thief に渡されます。
t と thief は、どちらも同じThiefインスタンスを参照しています。
そのため、
thief.hp += 10;
で参照先のThiefインスタンスの hp が 25 から 35 に変更されます。
結果として、t.hp を表示すると 35 になります。
*/
