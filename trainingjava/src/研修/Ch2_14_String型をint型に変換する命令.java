package 研修;

public class Ch2_14_String型をint型に変換する命令 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String age = "31";
		int n = Integer.parseInt(age);
		
		System.out.println(
				"あなたは来年、" + (n + 1) + "歳になりますね。");
	}

}
