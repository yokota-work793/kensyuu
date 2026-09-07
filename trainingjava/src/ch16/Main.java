package ch16;

// ラッパークラスをArrayListに格納する

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// Integer型でArrayListを宣言
		ArrayList<Integer> points = new ArrayList<Integer>();
		
		// 自動的にIntegerに変換、格納される
		points.add(10);
		points.add(80);
		points.add(75);
		
		// 拡張for文も利用可能
		for (int i : points) {
			System.out.println(i);
		}
	}
}
