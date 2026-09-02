package 研修;

public class Ch3_9_for文のループを2重にして九九の表を出力する {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				
				System.out.println(i * j);
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
}
