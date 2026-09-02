package 研修;

public class Ch1_3_変数の再代入 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int age = 20;
		System.out.println("私の年齢は" + age);

		age = 31;
		System.out.println("・・・いや、本当の年齢は" + age);
	}

}

//すでに値が入っている変数に代入すると、古い値は消滅し、内容は新しい値に書き換わる