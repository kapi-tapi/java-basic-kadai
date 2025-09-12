package text.kadai_018;

abstract class Kato_Chapter18 {
	
	//姓名住所フィールド
	public String familyName = "加藤";
	public String givenName;
	public String address = "東京都中野区〇×";
	
	//メソッド
	public void commonIntroduce(String famlyname, String givenName, String address) {
		// 共通の紹介を出力する
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
	}
	abstract void eachIntroduce(); 
		// 個別の紹介を出力する

	public void execIntroduce() {
		commonIntroduce(familyName, givenName, address);
		eachIntroduce();
	};
		// 紹介を実行する
	

}
