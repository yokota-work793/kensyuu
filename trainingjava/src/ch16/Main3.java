package ch16;

// コレクションのset（集合）　重複がなく順序を持たない複数の情報を格納できる

import java.util.HashSet;
import java.util.Set;

public class Main3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Set<String> colors = new HashSet<String>();
		colors.add("赤");
		colors.add("黄");
		colors.add("青");
		// 赤は重複しているので、実行結果で無視される
		colors.add("赤");
		
		// 色の種類を表示
		System.out.println("色は" + colors.size() + "種類");
		
		// 色を取り出す
		for (String s : colors) {
		System.out.print(s + "->");
		}
	}
}
