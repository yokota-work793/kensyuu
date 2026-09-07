package ch12.Training;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Y[] array = new Y[2];
		array[0] = new A();
		array[1] = new B();
		for (Y y : array) {
			y.b();
		}
	}
}
