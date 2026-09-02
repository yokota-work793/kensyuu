package 研修;

public class Ch3_5_case文に複数の値を指定する {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println(
				"あなたの運勢を占います");
		
		int fortune =
				new java.util.Random().nextInt(5) + 1;
		
		switch (fortune) {
		case 1, 2 -> {
			System.out.println("いいね！");
		}
		
		case 3 -> {
			System.out.println("普通");
		}
		
		case 4, 5 -> {
			System.out.println("うーん...");
		}
		}
	}
}
