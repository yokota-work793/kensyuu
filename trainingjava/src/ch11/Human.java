package ch11;

// インタフェースを継承する
public interface Human extends Creature {
	
	void talk();
	void watch();
	void hear();
	
	// さらに、親インタフェースからrun()を継承する

}

// クラス同士、インタフェース同士の継承はextends
// インタフェースからクラスへの継承はimplements