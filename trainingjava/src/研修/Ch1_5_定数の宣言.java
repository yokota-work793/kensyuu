package 研修;

public class Ch1_5_定数の宣言 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		final double PI = 3.14;
		int pie = 5;
		
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie * PI);
		System.out.println("パイの半径を倍にします");
		
		PI = 10;
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie * PI);
	}

}

//実行結果は、エラー
//final変数PIに値を代入することができないため