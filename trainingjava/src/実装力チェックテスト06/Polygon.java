package 実装力チェックテスト06;

public abstract class Polygon extends Shape {
	
	protected int angle;
	
	public abstract void draw();
	
	public abstract double getPerimeter();
	
	public int getInternalAngle() {
		return (angle - 2) * 180;
	}

}
