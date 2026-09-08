package ch17;

// try-with-resouces文の利用

import java.io.FileWriter;
import java.io.IOException;

public class Main6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// try-catch文を抜ける際に、自動的にclose()が呼び出されるので、finallyブロックの記述は不要
		try (FileWriter fw = new FileWriter("data.txt");) {
			fw.write("hello!");
		} catch (IOException e) {
			System.out.println("何らかの例外が発生しました");
		}
	}
}