package ch17.Training;

public class Main3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		try {
			int i = Integer.parseInt("三");
			
		// APIリファレンスで調べた送出される例外	
		} catch (NumberFormatException e) {
			System.out.println(
					"NumberFormatException例外をcatchしました");
		}
	}
}

// NumberFormatException
// 文字列を数値に変換しようとしたが、数値として正しく解釈できないフォーマットだったときに発生する例外処理
// intに変換するInteger.parseInt()などを使用する際に多く発生する
