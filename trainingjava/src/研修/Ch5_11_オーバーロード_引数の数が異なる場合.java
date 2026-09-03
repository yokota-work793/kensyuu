package 研修;

public class Ch5_11_オーバーロード_引数の数が異なる場合 {

	public static int add(int x, int y) {
		return x + y;
	}
	
	public static int add(int x, int y, int z) {
		return x + y + z;
	}
	
	public static void main(String[] args) {
		System.out.println("10+20=" + add(10,20));
		
		System.out.println("10+20+30=" + add(10,20,30));
	}
}

/*
オーバーロード
仮引数の個数か型が異なれば、同じ名前のメソッドを複数定義でき
る。引数は同じで、戻り値の型だけが異なるものは定義できない。
*/