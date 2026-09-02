package 研修;

public class Ch2_4_テキストブロックを用いた複数行の文字列 {

	public static void main(String[] args) {

		String prof1 = "名前:浅香あゆみ\n (あさかあゆみ)";
		String prof2 = """
				名前：湊雄輔
				(みなとゆうすけ)
				""";

		System.out.println(prof1);
		System.out.println(prof2);
	}

}
