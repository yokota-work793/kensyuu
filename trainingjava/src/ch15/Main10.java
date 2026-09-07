package ch15;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main10 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// Instantの生成
		Instant i1 = Instant.now();
		
		// Instantとlong値との相互変換
		Instant i2 = Instant.ofEpochMilli(1600705425827L);
		long l = i2.toEpochMilli();
		
		// ZonedDateTimeの生成
		// 現在の日時を取得
		ZonedDateTime z1 = ZonedDateTime.now();
		ZonedDateTime z2 = ZonedDateTime.of(
				2023, 1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo"));
		// 「2023年1月2日 3:04:05.000000006 （東京時間）」という特定の日時を明示
		
		// InstantとZoneDateTimeの相互変換
		Instant i3 = z2.toInstant();
		ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));
				
		// ZoneDateTimeの利用方法
		System.out.println(
				"東京：" + z2.getYear() + z2.getMonth() + z2.getDayOfMonth());
		System.out.println(
				"ロンドン：" + z3.getYear() + z3.getMonth() + z3.getDayOfMonth());
		
		// 同じ瞬間の判定には、equals()ではなくisEqual()を使う
		if (z2.isEqual(z3)) {
			System.out.println("これらは同じ瞬間を指しています");
		}
	}
}
