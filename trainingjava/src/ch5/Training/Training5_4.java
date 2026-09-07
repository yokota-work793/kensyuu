package ch5.Training;

public class Training5_4 {

	public static void calcTraiangleAlea (double bottom, double height) {
		double area = (bottom * height) / 2;
		System.out.println(
				"三角形の面積：" + area + "平方cm");
		//return area;
	}
	
	public static double calcCircleAlea (double radius) {
		double area = radius * radius * 3.14;
		return area;
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		calcTraiangleAlea(10.0, 5.0);

		
		double circleArea = calcCircleAlea(5.0);
		System.out.println(
				"円の面積：" + circleArea + "平方cm");
	}

}
