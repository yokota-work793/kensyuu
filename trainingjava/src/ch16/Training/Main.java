package ch16.Training;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// インスタンス化
		Hero h1 = new Hero("斎藤");
		Hero h2 = new Hero("鈴木");
		
		// ArrayListに格納
		ArrayList<Hero> heroes = new ArrayList<Hero>();
		heroes.add(h1);
		heroes.add(h2);
		
		// 1人ずつ順番に取り出して名前を表示
		for (Hero h : heroes) {
			System.out.println(h.getName());
		}
		
		// それぞれの勇者が倒した敵の数と勇者をペアで格納
		Map<Hero, Integer> heroes1 = new HashMap<Hero, Integer>();
		heroes1.put(h1, 3);
		heroes1.put(h2, 7);
		
		// 1人ずつ順番に取り出して倒した数を表示
		for (Hero key : heroes1.keySet()) {
			int value = heroes1.get(key);
			System.out.println(key.getName() + "が倒した敵＝" + value);
		}

	}

}
