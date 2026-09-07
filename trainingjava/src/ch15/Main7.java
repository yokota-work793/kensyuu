package ch15;

import java.util.Date;

// 現在日時を表示する

public class Main7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 現在の日時を取得
		Date now = new Date();
		
		System.out.println(now);
		System.out.println(now.getTime());
		
		// 1970年1月1日 から 1,694,984,000,000 ミリ秒経過した時点を取得
		Date past = new Date(1694984000000L);
		System.out.println(past);
	}
}
