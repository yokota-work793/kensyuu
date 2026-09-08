package ch18;

import java.io.FileReader;

// ファイルから1文字ずつ読み込む

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		
		// ファイルを開く
		FileReader fr = new FileReader("data.txt");
		int input = fr.read();
		
		// ファイルの最後まで1文字ずつ読む
		while (input != -1) {
			System.out.print((char) input);
			input = fr.read();
		}
		
		// ファイルを閉じる
		fr.close();
	}
}
