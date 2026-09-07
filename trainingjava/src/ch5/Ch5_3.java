package ch5;

public class Ch5_3 {

	public static void methodA() {
		System.out.println("methodA");
		methodB(); // methodBの呼び出し
	}
	
	public static void methodB() {
		System.out.println("methodB");
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		methodA(); // methodAの呼び出し

	}

}
