package ch15;

// 処理時間を計測する

public class Main6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		long start = System.currentTimeMillis();
		
		// ここで何らかの時間がかかる処理
		long end = System.currentTimeMillis();
		
		System.out.println(
				"処理にかかった時間は・・・" + (end - start) + "ミリ秒でした");
	}

}
