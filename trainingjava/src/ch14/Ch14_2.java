package ch14;

import ch10.Hero;

// Object型にさまざまなインスタンスを代入

public class Ch14_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Object o1 = new Empty();
		Object o2 = new Hero();
		Object o3 = "こんにちは";
	}
}

/*
 * 全クラスの祖先であるjava.lang.Objectクラスがわざわざ準備してある理由
 * 理由1 多態性を利用できるようになるから
 *      すべてのクラスがObjectを先祖に持つため、「すべてのクラス is-a Object」といえる。
 * 理由2 全クラスが最低限備えるべきメソッドを定義できるから
 *      Objectクラスにequals()などが定められているので、クラスの種類を気にすることなく、常に同じ方法で内容を比較したりできる。
 */