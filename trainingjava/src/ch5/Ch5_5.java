package ch5;

// 複数の引数を渡す

public class Ch5_5 {

 public static void main(String[] args) {
	 add(100, 20); // 100と20を渡してaddメソッドを呼び出す
	 add(200, 50); // 200と50を渡してaddメソッドを呼び出す
 }
 
 public static void add(Integer x, Integer y) {
	 int ans = x + y;
	 System.out.println(x + "+" + y + "=" + ans);
}
}
