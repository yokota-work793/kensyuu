package ch11;

//インタフェースを継承する場合は、implementsを使う（extendsではない）
public class KyotoCleaningShop implements CleaningService {
	
	String ownerNameString;
	String address;
	String phone;
	
	// シャツを洗う
	public Shirt washShirt (Shirt s) {
		
		// 大型洗濯機15分
		return s;
	}
	
	// タオルを洗う
	public Towl washTowl(Towl t) {
		
		// 大型洗濯機10分
		return t;
	}
	
	// コートを洗う
	public Coat washCoat(Coat c) {
		
		// ドライ20分
		return c;
	}

	@Override
	public Coat wachCoat(Coat c) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}
