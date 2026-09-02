package 研修;

public class Ch4_17_nullの利用_エラー {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] array = {1, 2, 3};
		array = null;
		array[0] = 10;
	}
}
