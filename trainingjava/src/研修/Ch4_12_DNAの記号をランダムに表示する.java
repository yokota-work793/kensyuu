package 研修;

public class Ch4_12_DNAの記号をランダムに表示する {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] seq = new int[10];
		
		// 塩基配列をランダムに生成
		for (int i = 0; i < seq.length; i++) {
			seq[i] = new java.util.Random().nextInt(4);
		}
		
		// 生成し塩基配列の記号を表示
		for (int i = 0; i < seq.length; i++) {
			switch (seq[i]) {
			case 0 -> {
				System.out.println("A ");
			}
			
			case 1 -> {
				System.out.println("T ");
			}
			
			case 2 -> {
				System.out.println("G ");
			}
			
			case 3 -> {
				System.out.println("C ");
			}
			}
		}
	}
	
}
