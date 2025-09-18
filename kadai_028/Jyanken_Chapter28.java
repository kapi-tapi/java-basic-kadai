package text.kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	// メソッドの設定
	// 自分のじゃんけんの手を入力する
	public String getMyChoice() {
		String input = "";
		
		while(!input.equals("r") && !input.equals("s") && !input.equals("p")) {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			Scanner scanner = new Scanner(System.in);
			input = 	scanner.next();
		}
	
		
	return input;	
		
	}
	

	// 対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {
		double random =  Math.random() * 3;
		int floorRandom = (int) Math.floor(random);
		String[] jankenArray = {"r","s","p"};
		String randomHand = jankenArray[floorRandom];		
		return randomHand;
				
	}

	// じゃんけんを行う
	public void playGame() {
		
		// 自分と対戦相手の手を出力する

		HashMap<String,String> handMap = new HashMap<String,String>();
		handMap.put("r", "グー");
		handMap.put("s", "チョキ");
		handMap.put("p", "パー");
		
		String myHand = handMap.get(getMyChoice());
		String yourHand = handMap.get(getRandom()); 

		
		System.out.println("自分の手は" + myHand + ",対戦相手の手は" + yourHand);
		
		// 自分と対戦相手の手を比較する
		if(myHand.equals(yourHand) ) {
			System.out.println("あいこです");
		} else if ((myHand.equals("グー") && yourHand.equals("チョキ")) ||
				   (myHand.equals("チョキ") && yourHand.equals("パー"))	||
				   (myHand.equals("パー") && yourHand.equals("グー"))) {
			System.out.println("自分の勝ちです");
		} else if ((myHand.equals("チョキ") && yourHand.equals("グー")) ||
				   (myHand.equals("パー") && yourHand.equals("チョキ"))	||
				   (myHand.equals("グー") && yourHand.equals("パー"))) {
			System.out.println("自分負けです");
		}
	}


}


	
