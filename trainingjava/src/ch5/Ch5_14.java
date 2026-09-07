package ch5;

// 戻り値が配列の場合

public class Ch5_14 {

	public static int[] makeArray(int size) {
		int[] newArray = new int[size];

		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = i;
		}
		return newArray;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] array = makeArray(3);
		for (int i : array) {
			System.out.println(i);
		}
	}

}

/*
 * main メソッド開始
 * public static void main(String[] args)
 * makeArray メソッドの呼び出し
 * makeArray(3);
 * 引数 size に 3 が渡される
 * 配列の作成（メモリ確保）
 * int[] newArray = new int[3];
 * 要素数3の配列が作られる（初期状態は [0, 0, 0]）
 * makeArray 内のループ処理（値の代入）
 * for (int i = 0; i < newArray.length; i++)
 * newArray[0] = 0
 * newArray[1] = 1
 * newArray[2] = 2
 * （配列の中身が [0, 1, 2] になる）
 * 配列の参照（場所情報）を返す
 * return newArray;
 * 作成した配列への参照を呼び出し元へ戻す
 * 受け取った参照を array に代入
 * int[] array = makeArray(3);
 * main 側の array が、makeArray 内で作られた配列 {0, 1, 2} を指すようになる
 * main 内の拡張 
 * for 文（出力処理）
 * for (int i : array)
 * System.out.println(i); （0 を出力）
 * System.out.println(i); （1 を出力）
 * System.out.println(i); （2 を出力）
 * プログラム終了
 */
