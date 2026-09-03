package 研修;

public class Ch5_練習問題5_3 {

	public static void main(String[] args) {
		email("メールの宛先アドレス","メールのタイトル","メールの本文");
		
		email("メールの宛先アドレス","メール本文");
	}
	
	//練習5-2:引数が3つ
	public static void email(String address, String title, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名:" + title);
		System.out.println("本文:" + text);
	}
	
	//練習5-3:引数が2つ
	public static void email(String address,String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名:無題");
		System.out.println("本文:" + text);
	}
}
