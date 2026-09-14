package chapter11_12;

public abstract class Polygon extends Shape {
	
	protected int angle;
	
	public abstract void draw();
	
	public abstract double getPerimeter();
	
	public int getinternalAngle() {
		return (angle - 2)* 180;
		
	}
	
}
