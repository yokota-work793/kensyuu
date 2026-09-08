package ch17;

import java.rmi.UnexpectedException;

// オリジナル例外を利用する

public class Main8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 試験的に例外を発生させる
		try {
			throw new UnexpectedException("未対応のファイルです");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

// e.printStackTrace();を実行すると、コンソールに以下が出力される
// 発生した例外の種類
// エラーメッセージ
// プログラムのどこでエラーが起きたか（発生場所のStackTrace）

// Exception　　　　　　　IOException
// すべての例外の親クラス　　入出力処理のエラーに特化した子クラス
