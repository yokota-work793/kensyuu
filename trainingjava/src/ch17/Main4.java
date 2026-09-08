package ch17;

import java.io.FileWriter;
import java.io.IOException;

public class Main4 {

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

		// finally もtry-catchする
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				;
			}
		}
	}
}