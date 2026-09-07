package ch15;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main12 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 文字列からLocalDateを生成
		DateTimeFormatter fmt =
				DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate ldate =
				LocalDate.parse("2023/09/22", fmt);
				
				// 1000日後を計算する
				LocalDate ldatep = ldate.plusDays(1000);
				String string = ldatep.format(fmt);
				System.out.println("1000日後は" + string);
				
				// 現在日付との比較
				LocalDate nowDate = LocalDate.now();
				if (nowDate.isAfter(ldatep)) {
					System.out.println("本日は、その日より過去です。");
				}

	}

}
