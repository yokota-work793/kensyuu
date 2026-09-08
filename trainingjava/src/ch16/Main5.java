package ch16;

// HashMap 
// キー（key)と値（value）をペアとして格納する方法

import java.util.HashMap;
import java.util.Map;

public class Main5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// HashMapのインスタンス化
		Map<String, Integer> prefs = new HashMap<String, Integer>();
		
		// ペアで値を格納
		prefs.put("京都府", 255);
		prefs.put("東京都", 1261);
		prefs.put("熊本県", 181);
		
		// 指定した値を取得
		int tokyo = prefs.get("東京都");
		System.out.println("東京都の人口は、" + tokyo);
		
		// 指定した値を削除
		prefs.remove("京都府");
		
		// 指定した値を上書き
		prefs.put("熊本県", 182);
		
		// 上書き後に値を取得
		int kumamoto = prefs.get("熊本県");
		System.out.println("熊本県の人口は、" + kumamoto);
		
		// 新たに京都府を格納
		prefs.put("京都府", 255);
		
		// マップに格納された情報を1つずつ取り出す
		for (String key : prefs.keySet()) {
			int value = prefs.get(key);
			System.out.println(key + "の人口は、" + value);
		}
	}
}
