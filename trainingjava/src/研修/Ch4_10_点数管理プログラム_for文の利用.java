package 研修;

public class Ch4_10_点数管理プログラム_for文の利用 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] scores = {20, 30, 40, 50, 80};
		int sum = 0;
		
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		int avg = sum / scores.length;
		
		System.out.println("合計点:" + sum);
		System.out.println("平均点:" + avg);
	}
}
