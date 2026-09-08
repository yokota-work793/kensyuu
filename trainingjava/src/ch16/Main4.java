package ch16;

// TreeSetは自然順序（辞書順）付けで整列する

import java.util.Set;
import java.util.TreeSet;

public class Main4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Set<String> words = new TreeSet<String>();
		words.add("dog");
		words.add("cat");
		words.add("wolf");
		words.add("panda");
		
		// TreeSetから文字列を取り出す
		for (String s : words) {
			System.out.print(s + "->");
		}
	}
}
