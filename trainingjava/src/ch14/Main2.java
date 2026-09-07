package ch14;

// 2人の勇者を比較する
public class Main2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Hero h1 = new Hero();
		h1.name = "ミナト";
		h1.hp = 100;
		
		Hero h2 = new Hero();
		h2.name = "ミナト";
		h2.hp = 100;
		
		if (h1.equals(h2) == true) {
			System.out.println("同じ内容です");
		} else {
			System.out.println("違う内容です");
		}

	}

}

/* 
 * 「equals」と「==」の違い
 * 「equals」 = 等値　同一の存在であること。
 * 「==」 = 等価　同じ内容であること。
 */
