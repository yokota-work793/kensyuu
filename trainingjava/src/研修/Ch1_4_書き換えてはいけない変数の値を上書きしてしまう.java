package 研修;

public class Ch1_4_書き換えてはいけない変数の値を上書きしてしまう {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		double pi = 3.14;
		int pie = 5;
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie * pi);
		System.out.println("パイの半径を倍にします");

		//これは、誤り、代入すべきは"pie"
		pi = 10;
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie * pi);
	}

}
