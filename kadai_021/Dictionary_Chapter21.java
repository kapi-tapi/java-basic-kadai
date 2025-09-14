package text.kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	//検索する単語を格納する配列を作成
	String[] wordArray = {};
	
	// メソッド
	// HashMapの宣言と要素の追加
	public void searchWord( String[] wordArray ) {
	
		HashMap<String, String> dictionaryMap = new HashMap<String, String>();
		
		dictionaryMap.put("apple", "りんご");
		dictionaryMap.put("peach", "桃");
		dictionaryMap.put("banana", "バナナ");
		dictionaryMap.put("lemon", "レモン");
		dictionaryMap.put("pear", "梨");
		dictionaryMap.put("kiwi", "キウィ");
		dictionaryMap.put("strawberry", "いちご");
		dictionaryMap.put("grape", "ぶどう");
		dictionaryMap.put("muscat", "マスカット");
		dictionaryMap.put("cherry", "さくらんぼ");
		
	// wordArrayの単語が辞書に存在しているかを繰り返し判定する
	for (int i = 0; i < wordArray.length; i ++) {
		if (dictionaryMap.get(wordArray[i]) == null) {
			System.out.println(wordArray[i] + "は辞書に存在しません");
			} else {
			System.out.println(wordArray[i] + "の意味は" + dictionaryMap.get(wordArray[i]));
			}
		}
	
	}

}
