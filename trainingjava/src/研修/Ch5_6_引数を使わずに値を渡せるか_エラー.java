package 研修;

public class Ch5_6_引数を使わずに値を渡せるか_エラー {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int x = 100;
		int y = 10;

		//値を渡す形にする
		add(x, y);
	}

	//addメソッド側に、受け取るための引数を書く
	public static void add(int x, int y) {
		int ans = x + y;
		System.out.println(x + "+" + y + "=" + ans);
	}

}
