package 研修;

public class Ch5_14_戻り値が配列の場合 {

	//int型配列を作成して戻すメソッド
	public static int[] makeArray(int size) {
	int[] newArray = new int[size];
	for (int i = 0; i < newArray.length; i++) {
	newArray[i] = i;	
	}
	//配列を戻す
	return newArray;
	}

public static void main(String[] args) {
	int[] array = makeArray(3);
	
	//arrayの全要素を出力
	for (int i : array) {
		System.out.println(i);
	}
}
}