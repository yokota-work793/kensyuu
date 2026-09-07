package ch16;

// イテレータを使ったArrayListの繰り返し処理
import java.util.ArrayList;
import java.util.Iterator;

public class Main2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		ArrayList<String> namesArrayList = new ArrayList<String>();

		namesArrayList.add("湊");
		namesArrayList.add("浅香");
		namesArrayList.add("菅原");

		Iterator<String> it = namesArrayList.iterator();
		
		// 矢印を次に進められるなら繰り返す
		while (it.hasNext()) {
			
			// 矢印を次に進め、内容を取り出す
			String e = it.next();
			System.out.println(e);
		}
	}

}
