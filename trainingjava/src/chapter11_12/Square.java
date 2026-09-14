package chapter11_12;

public class Square extends Rectangle {
	
	public Square(int x, int y, int width) {
		super(x, y, width, width);
	}
	
	public void draw() {
		System.out.println("[正方形を描画]点(0,0)を基準として幅・高さ200の正方形");
	}

}
