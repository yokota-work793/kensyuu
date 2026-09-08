package ch17;

// finally処理


import java.io.FileWriter;
import java.io.IOException;

public class Main2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 本来の処理
		try {
			FileWriter fw = new FileWriter("data.txt");
			fw.write("hello!");
			fw.close(); // ファイルを閉じる処理が実行されない可能性がある
			System.out.println("書き込みが完了しました。");
		
		// 例外が発生した場合の処理
		} catch (IOException e) {
			System.out.println("エラーが発生しました。");
			
		// 例外があってもなくても必ず実行する処理	
		} finally {
		fw.close();
		}
	}
}
// finallyブロックでcloseすると、、、エラーが発生する
// 理由：tryブロック内でfwを定義しているので、fwが22行目で終了し、fwを見つけられないから