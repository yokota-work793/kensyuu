package ch17;

//例外インスタンスを自分で投げる

public class Person {

	int age;
	
	public void setAge(int age) {
		if (age < 0) {
			// 例外的状況の報告 throw new 例外クラス名();
			throw new IllegalArgumentException(
					"年齢は0以上の数を指定すべきです。指定値=" + age);
		}
		
		// 問題ないなら、フィールドに値をセット
		this.age = age;
	}
}
