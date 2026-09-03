package 研修;

public class Ch5_12_引数に配列を受け取るメソッド {

	//int型配列を受け取り、すべての要素を表示するメソッド
	public static void printArray(int[] array) {
		for(int element : array) {
			System.out.println(element);
		}
	}
	
	public static void main(String[] args) {
		int[] array = {1, 2, 3};
		//配列を渡す
		printArray(array);
	}
}
