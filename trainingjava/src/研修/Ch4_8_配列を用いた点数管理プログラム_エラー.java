package 研修;

public class Ch4_8_配列を用いた点数管理プログラム_エラー {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] scores = {20, 30, 40, 50, 80};
		
		//要素数は0からスタートする
		int sum = scores[1] + scores[2] + scores[3] + scores[4] + scores[5];
		int avg = sum / scores.length;
		
		System.out.println("合計点:" + sum);
		System.out.println("平均点:" + avg);
	}
}
