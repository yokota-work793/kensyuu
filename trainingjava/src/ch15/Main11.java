package ch15;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

// あいまいな日時を表すクラス

public class Main11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// LocalDateTimeの生成方法
		// 現在の日時を取得
		LocalDateTime l1 = LocalDateTime.now();
		LocalDateTime l2 = LocalDateTime.of(2024, 1, 1, 9, 5, 0, 0);

		// LocalDateTimeとZonedDateTimeの相互変換
		ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/London"));
		LocalDateTime l3 = z1.toLocalDateTime();
	}
}
