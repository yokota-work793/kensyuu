package ch17;

// 「初期化されていない変数fwを利用する可能性がある」エラーを解決する

import java.io.FileWriter;
import java.io.IOException;

public class Main3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 変数fwを宣言
		FileWriter fw;
		
		// tryブロックを作成
		try {
			// 右辺を実行しようとした瞬間に何らかの例外が発生し、処理がcatchブロックに以降する
			fw = new FileWriter("data.txt");
			fw.write("hello!");
			
		} catch (IOException e) {
			System.out.println("エラーです");
			
		} finally {
			// 変数fwが初期化されていない状態（nullさえ代入されていない状態）のため、エラーになる
			// FileWriter fw = null; を加えると、上記のエラーは解消するが、別のエラーが発生する
			fw.close();
		}
	}
}