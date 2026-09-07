package ch15;

// 6つのint値とDate型の相互変換
import java.util.Calendar;
import java.util.Date;

public class Main8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Calendar c = Calendar.getInstance();
		// 6つのint値からDateインスタンスを生成
		
		c.set(2023, 8, 18,5, 53, 20);
		// 月を9(10月)に変更
		c.set(Calendar.MONTH, 9);
		
		Date d = c.getTime();
		System.out.println(d);
		
		// Dateインスタンスからint値を生成
		Date now = new Date();
		c.setTime(now);
		
		// 年を取り出す
		int y = c.get(Calendar.YEAR);
		System.out.println("今年は" + y + "年です");

	}

}
