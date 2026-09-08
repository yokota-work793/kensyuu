package ch16;

// リストに格納した勇者の名前を書き換える

import java.util.ArrayList;
import java.util.List;

class Hero {
	public String name;
}

public class Main6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Hero h = new Hero();
		h.name = "ミナト";
		
		List<Hero> list = new ArrayList<Hero>();
		// hをリストに格納
		list.add(h);
		// 格納後にhのnameを書き換え
		h.name = "スガワラ";
		System.out.println(list.get(0).name);
	}
}
