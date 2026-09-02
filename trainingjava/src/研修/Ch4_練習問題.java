package 研修;

public class Ch4_練習問題 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}

//練習4-1
//int型の値を4個まとめて格納できる配列points
//int[] points = new int[4];

//double型の値を5個まとめて格納できる配列weights
//double[] weights = new double[5];

//boolean型の値を3つまとめて格納できる配列 answers
//boolean[] prints = new boolean[3];

//String型の値を3つまとめて格納できる配列 names
//String[] names = new string[3];

//練習4-2
//3つの口座残高「121902」「8302」「55100」が格納されているint 型配列　moneyListを宣言する。
//moneyListの要素を1つずつfor文で取り出して画面に表示する。
//moneyListの要素を拡張for文で1つずつ取り出して画面に表示する。

int[] accounts = {121902, 8302, 55100};
for (int i = 0; i < accounts.length; i++) {
	System.out.println(accounts[i]);
}

for