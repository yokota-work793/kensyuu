package ch5.Training;

public class Training5_3 {

	public static void email(String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名；無題");
		System.out.println("本文：" + text);
	}
	
	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String title = "sss";
		String address = "aaa@vvv,com";
		String text = "ddd";
		
		email(address, text);
	}

	
}
