package ch15;

// 文字列を調査する
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		String s1 = "スッキリJava";
		String s2 = "Java";
		String s3 = "java";
		
		if (s2.equals(s3)) {
			System.out.println("s2とs3は等しい");
		}
		
		if (s2.equalsIgnoreCase(s3)) {
			System.out.println("s2とs3はケースを区別しなければ等しい");
		}
		
		// 全角文字も半角文字も1文字としてカウント
		System.out.println("s1の長さは" + s1.length() + "です");
		
		// length() == 0 と書くより意味を直感的にとらえやすい
		if (s1.isEmpty()) {
			System.out.println("s1は空文字です");
		}
	}
}
