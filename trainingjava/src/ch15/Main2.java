package ch15;

// 文字列を検索する

public class Main2 {
	
	public static void main(String[] args) {
		
		String s1 = "Java and JavaScript";
		
		// 一部に文字列"Java"を含むかを調べる
		if (s1.contains("Java")) {
			System.out.println("文字列s1は、Javaを含んでいます");
		}
		
		// 文字列"Java"で終わるかを調べる
		if (s1.endsWith("Java")) {
			System.out.println("文字列s1は、Javaが末尾にあります");
		}
		
		// 文字"Java"が前から検索して最初に登場する位置を調べる
		System.out.println(
				"文字列s1で最初にJavaが登場する位置は" + s1.indexOf("Java"));
		
		// 文字"Java"が後ろから検索して最初に登場する位置を調べる
		System.out.println(
				"文字列s1で最後にJavaが登場する位置は" + s1.lastIndexOf("Java"));
	}

}
