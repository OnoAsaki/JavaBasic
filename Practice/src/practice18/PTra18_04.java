/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import entity.Player;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		String[] array;
		ArrayList<Player> players = new ArrayList<>();
		try (Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				array = line.split(",");
				Player player = new Player();
				player.setPosition(array[0]);
				player.setName(array[1]);
				player.setCountry(array[2]);
				player.setTeam(array[3]);
				players.add(player);
			}
		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりません");
		}

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
		Collections.shuffle(players);

		int gkCount = 0;
		int dfCount = 0;
		int mfCount = 0;
		int fwCount = 0;

		for (int i = players.size() - 1; i >= 0; i--) {
			if (players.get(i).getPosition().equals("GK")) {
				if(gkCount < 1) {
					System.out.println(players.get(i));
				}
				gkCount++;
			}

			if (players.get(i).getPosition().equals("DF")) {
				if(dfCount < 4) {
					System.out.println(players.get(i));
				}
				dfCount++;
			}
			if (players.get(i).getPosition().equals("MF")) {
				if(mfCount < 4) {
					System.out.println(players.get(i));
				}
				mfCount++;
			}
			if (players.get(i).getPosition().equals("FW")) {
				if(fwCount < 4) {
					System.out.println(players.get(i));
				}
				fwCount++;
			}
		}

		//        for(Player name:players) {
		//        	System.out.println(name.toString());
		//        }
	}
}
