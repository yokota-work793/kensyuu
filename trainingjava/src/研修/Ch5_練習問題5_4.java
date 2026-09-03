package 研修;

public class Ch5_練習問題5_4 {

	public static void main(String[] args) {
		double triangleArea = calcTriangleArea(10.0, 5.0);
		System.out.println("三角形の面積は" + triangleArea + "平方cm");

		double circleArea = calcCircleArea(5.0);
		System.out.println("円の面積は" + circleArea + "平方cm");
	}

	public static double calcTriangleArea(double bottom, double height) {
		return bottom * height / 2;
	}

	public static double calcCircleArea(double radius) {
		return radius * radius * 3.14;
	}
}
