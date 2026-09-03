package calcapp.main;
//6-1 計算機プログラム

import calcapp.logics.CalcLogic;

/*全クラスインポートの場合は、
 * import calcapp.logics.*;
 */

public class Calc {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 10;
		int b = 2;
		
		int total = CalcLogic.tasu(a, b);
		int delta = calcapp.logics.CalcLogic.hiku(a, b);
		/*
		int total = calcapp.logics.CalcLogic.tasu(a, b);
		int delta = calcapp.logics.CalcLogic.hiku(a, b);
		*/
		
		System.out.println("足すと" + total + "、引くと" + delta);
	}
}
	/*
	public static int tasu(int a, int b) {
		return (a + b);
	}

	public static int hiku(int a, int b) {
		return (a - b);
	}
}；；
*/