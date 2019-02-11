package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		// 目的地までの距離
		final int distance = 300;

		Car car1 = new Car ();
		car1.distance = distance;
		car1.serialNo = 10000;
		car1.color = "Red";
		car1.gasoline = 50;

		Car car2 = new Car();
		car2.distance = distance;
		car2.serialNo = 20000;
		car2.color = "Blue";
		car2.gasoline = 50;

		Car car3 = new Car();
		car3.distance = distance;
		car3.serialNo = 30000;
		car3.color = "Yellow";
		car3.gasoline = 50;

		int gasoline1 = car1.gasoline;
		int run1 = car1.run();
		if(run1 == -1) {
			System.out.println("目的地に到達できませんでした");
		}else {
			gasoline1 -= run1;
			System.out.println("目的地にまで"  + gasoline1 + "時間かかりました。残りのガソリンは、" + run1 + "リットルです。");
		}

		int gasoline2 = car2.gasoline;
		int run2 = car2.run();
		if(run2 == -1) {
			System.out.println("目的地に到達できませんでした");
		}else {
			gasoline2 -= run2;
			System.out.println("目的地にまで"  + gasoline2 + "時間かかりました。残りのガソリンは、" + run2 + "リットルです。");
		}

		int gasoline3 = car3.gasoline;
		int run3 = car3.run();
		if(run3 == -1) {
			System.out.println("目的地に到達できませんでした");
		}else {
			gasoline3 -= run3;
			System.out.println("目的地にまで"  + gasoline3 + "時間かかりました。残りのガソリンは、" + run3 + "リットルです。");
		}


	}
}
