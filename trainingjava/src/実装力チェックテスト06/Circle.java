package 実装力チェックテスト06;

public class Circle extends Shape {
	
	private Point center;
	private int radius;
	
	public Circle() {
		this.center = new Point(0, 0);
		this.radius = 0;
	}
	
	public Circle(int x, int y, int r) {
		this.center = new Point(x, y);
		this.radius = r;
	}
	
	public void draw() {
		System.out.println("[円を描画]中心点(100,100)から半径20");
	}
	
	public double getPerimeter() {
		double result = radius * 2 * Math.PI;
		// PIは定数なので()は付けない
		
		return result;
	}

}
