package ch17;

// 「NullPointerExceptionの発生」に対応する
// ファイルが開いたときだけ後片付け処理をする

import java.io.FileWriter;
import java.io.IOException;

public class Main5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 変数fwを宣言
		FileWriter fw = null;

		// tryブロックを作成
		try {
			// 右辺を実行しようとした瞬間に何らかの例外が発生し、処理がcatchブロックに以降する
			fw = new FileWriter("data.txt");
			fw.write("hello!");

		} catch (IOException e) {
			System.out.println("エラーです");

		} finally {
			// fwがnullではないときだけclose()を試みる
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					;
				}
			}
		}
	}
}