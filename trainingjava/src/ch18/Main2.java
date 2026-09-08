package ch18;

import java.io.FileReader;

// ファイルに1文字ずつ書き込む

import java.io.FileWriter;

public class Main2 {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		
		// ファイルを開く
		FileWriter fw = new FileWriter("data.txt");
		
		// 1文字ずつ書く
		fw.write('そ');
		fw.write('れ');
		fw.write('で');
		fw.write('は');
		
		// ファイルを閉じる
		fw.close();
		
		// ファイルを開く
		FileReader fr = new FileReader("data.txt");
		int input = fr.read();
		
		// 1文字ずつ読む
		while (input != -1) {
			System.out.print((char)input);
			input = fr.read();	
		}
		// ファイルを閉じる
		fw.close();
	}

}
