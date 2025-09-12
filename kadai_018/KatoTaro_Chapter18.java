package text.kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18 {
	
	public void setGivenName(String givenName) {
		this.givenName = givenName ;
	}
	
	void eachIntroduce() {
		System.out.println("Javaが得意です");
	}
	
}



/*abstract class Kato_Chapter18 {
	
	//姓名住所フィールド
	public String familyName = "加藤";
	public String givenName;
	public String address;
	
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
*/