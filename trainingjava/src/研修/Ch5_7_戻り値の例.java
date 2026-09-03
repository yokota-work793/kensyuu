package 研修;

public class Ch5_7_戻り値の例 {

	public static int add(int x, int y) {
		int ans = x + y;
		return ans;
	}
	
	public static void main(String[] args) {
		int ans = add(100, 10);
		System.out.println("100 + 10 = " + ans);
	}
}

/*
 よくある間違い① add(100, 10) = int ans;
「まずaddを呼び出さなきゃ！」という思いからadd(100, 10) と書き、
「次にansに代入しなきゃ！」という思いから= int ans; と書いてしまう
パターンです。構文として間違っているのでコンパイルエラーになります。
よくある間違い② add(100, 10);
「addを呼び出さなきゃ！」という思いが強すぎて、int ans = の部分を
忘れています。add()は正しく実行されて結果の110が戻ってきているのです
が、呼び出し元で受け取っていないため、mainメソッド内で戻り値を利用
できません。
 */
