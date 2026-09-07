package ch5;

// 同じ配列を参照している状態を確認する

public class Ch5_13 {

	// int型配列を受け取り、配列内の要素すべてに1を加えるメソッド
	public static void incArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i]++;
		}
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] array = {1, 2, 3};
		incArray(array);
		for (int i : array) {
			System.out.println(i);
		}
	}

}

/*
 * main メソッド開始
 * public static void main(String[] args)
 * 配列の初期化
 * int[] array = {1, 2, 3};
 * メモリ上に {1, 2, 3} が作られ、その参照（場所）が array に入る
 * incArray メソッドの呼び出し
 * incArray(array);
 * 配列の参照が incArray 側の引数 array に渡される
 * incArray 内の処理（要素の加算）
 * for (int i = 0; i < array.length; i++)
 * array[0]++ （1 から 2 へ）
 * array[1]++ （2 から 3 へ）
 * array[2]++ （3 から 4 へ）
 * incArray メソッドの終了
 * 処理が main メソッドへ戻る
 * main 内の拡張for文（出力処理）
 * for (int i : array)
 * System.out.println(i); （2 を出力）
 * System.out.println(i); （3 を出力）
 * System.out.println(i); （4 を出力）
 * プログラム終了
 */
