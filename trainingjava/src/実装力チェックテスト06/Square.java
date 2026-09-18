package 実装力チェックテスト06;

public class Square extends Rectangle {
	
	//スーパークラスRectangleのコンストラクタを呼び出す
	public Square(int x, int y, int width, int height) {
		super(x, y, width, width);
	}
	
	public void draw() {
		System.out.println("[正方形を描画]点(0,0)を基準として幅・高さ200の正方形");
	}

}
