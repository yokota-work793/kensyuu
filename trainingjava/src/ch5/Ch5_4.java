package ch5;

// メソッドの呼び出し
// 引数を1つだけ渡す

public class Ch5_4 {

 public static void main(String[] args) {
	 System.out.println("メソッドを呼び出します");
	 hello("湊"); // "湊"を渡してhelloメソッドを呼び出す
	 hello("浅香"); // "浅香"を渡してhelloメソッドを呼び出す
	 hello("菅原"); // "菅原"を渡してhelloメソッドを呼び出す
	 System.out.println("メソッドの呼び出しが終わりました");
 }
 
 /*
 public static void hello() {
	 System.out.println("湊さん、こんにちは");
	*/
 
 public static void hello(String name) {
	 System.out.println(name + "さん、こんにちは");
}
}
