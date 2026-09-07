package ch15;

// StringBuilderで文字列を1万回連結する

public class Main4 {
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 1000; i++) {
			// バッファにJavaを追加
			sb.append("Java");
		}
		
		// 完成した連結済み文字列を取り出す
		String s = sb.toString();
		System.out.println(s);
		
	}

}
