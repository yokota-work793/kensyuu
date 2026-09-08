package ch16;

// イテレータを使ったArrayListの繰り返し処理
import java.util.ArrayList;
import java.util.Iterator;

public class Main2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// ArrayListの宣言　ArrayList<>変数名 = new ArrayList<>();
		ArrayList<String> namesArrayList = new ArrayList<String>();

		// 要素を格納する
		namesArrayList.add("湊");
		namesArrayList.add("浅香");
		namesArrayList.add("菅原");

		// イテレータとは、リストに含まれる1つの箱を「ココ」と指している矢印のようなもの
		// イテレータの取得　Iterator<リスト要素の型> it = リスト変数.iterator();
		Iterator<String> it = namesArrayList.iterator();
		
		// イテレータを用いた要素の取り出し
		// 矢印を次に進められるなら繰り返す
		while (it.hasNext()) {
			
			// 矢印を次に進め、内容を取り出す
			String e = it.next();
			System.out.println(e);
		}
	}

}
