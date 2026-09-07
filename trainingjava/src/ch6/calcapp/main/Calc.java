package ch6.calcapp.main;

import ch6.calcapp.logics.CalcLogic;

// 計算機プログラム

public class Calc {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int a = 10;
		int b = 2;
		int total = CalcLogic.tasu(a, b);
		int delta = CalcLogic.hiku(a, b);
		System.out.println("足すと" + total + "、引くと" + delta);
	}
	/*
	public static int tasu(int a, int b) {
		return (a + b);
	}

	public static int hiku(int a, int b) {
		return (a - b);
	}
	*/
	
}
