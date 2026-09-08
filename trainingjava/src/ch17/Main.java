package ch17;

// チェック例外 try-catch

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 本来の処理
		try {
			FileWriter fw = new FileWriter("data.txt");
			fw.write("hello!");
			fw.close();
			System.out.println("書き込みが完了しました。");
		
		// 例外が発生した場合の処理
		} catch (IOException e) {
			System.out.println("エラーが発生しました。");
		}
	}
}
