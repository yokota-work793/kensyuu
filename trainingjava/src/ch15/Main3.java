package ch15;

public class Main3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String s1 = "Java programming";
		
		// 指定位置から始まる文字列を任意の長さだけ切り出す
		System.out.println(
				"文字列s1の4文字目以降は" + s1.substring(3));
		
		// 位置指定8の文字は含まれない点に注意する
		System.out.println(
				"文字列s1の4~8文字目は" + s1.substring(3, 8));
	}

}
