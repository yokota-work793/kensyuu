package 実装力チェックテスト06;

public class Triangle extends Polygon {
	
	private Point p1;
	private Point p2;
	private Point p3;
	
	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		this.p1 = new Point(x1, y1);
		this.p2 = new Point(x2, y2);
		this.p3 = new Point(x3, y3);
		
		this.angle = 3;
	}
	
	public void draw() {
		System.out.println("[三角形を描画]点1(0,0)から点2(100,100)、点3(0,200)の三角形");
	}
	
	public double getPerimeter() {
		
		// 座標点の長さを求める sqrt((x_2-x_1)^2+(y_2-y_1)^2)
		// p1からp2までの長さ
		double size1 = Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) 
				+ (Math.pow(p2.getY() - p1.getY(), 2)));
		
		// p2からp3までの長さ
		double size2 = Math.sqrt(Math.pow(p3.getX() - p2.getX(), 2)
				+ (Math.pow(p3.getY() - p2.getY(), 2)));
		
		// p3からp1までの長さ
		double size3 = Math.sqrt(Math.pow(p1.getX() - p3.getX(), 2)
				+ (Math.pow(p1.getY() - p3.getY(), 2)));
		
		double result = size1 + size2 + size3;
		
		return result;
	}

}
