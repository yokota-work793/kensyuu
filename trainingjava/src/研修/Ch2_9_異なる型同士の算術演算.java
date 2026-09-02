package 研修;

public class Ch2_9_異なる型同士の算術演算 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//int側の 2 が double に合わせる
		double d = 8.5 / 2;
		
		//int より long のほうが扱える範囲が広いため、5 が long に合わせる
		long l = 5 + 2L;
		
		System.out.println(d);
		System.out.println(l);
		
	}

}


