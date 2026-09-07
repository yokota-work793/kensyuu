package ch15;

// 文字列の分割と置換

public class Main5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String s = "abc,def,ghi";

		// splitメソッドを使った文字列の分割
		String[] words = s.split("[,:]");
		for (String w : words) {
			System.out.print(w + "->");
		}

		// replaceAllメソッドを使った文字列の痴漢
		String words2 = s.replaceAll("[beh]", "X");
		System.out.print(words2);
	}

}
