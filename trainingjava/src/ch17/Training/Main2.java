package ch17.Training;

public class Main2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		try {
			String s = null;
			System.out.println(s.length());
			
		} catch (Exception e) {
			System.out.println("NullPointerException例外をcatchしました");
			System.out.println("--スタックトレース（ここから）--");
			e.printStackTrace();
			System.out.println("--スタックトレース（ここまで）--");
		}
	}
}
