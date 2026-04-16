package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 登録済み商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 100, 200, 300, 400, 500 };
		// 購入数（変更不可）
		int[] amounts = new int[5];

		// TODO: 実装ここから
		int[] stocks = new int[5];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < 5; i++) {
			System.out.println(itemNames[i] + "の在庫数:>");
			stocks[i] = Integer.parseInt(br.readLine());
		}

		for (int i = 0; i < 5; i++) {
			System.out.println(itemNames[i] + "の購入数:>");
			amounts[i] = Integer.parseInt(br.readLine());
			if (amounts[i] > stocks[i]) {
				System.out.println("在庫を超えています。もう一度入力してください。");
				i--;
			}
		}
		int totalPrice = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println(itemNames[i] + "：購入 " + amounts[i] + "個\n" + "在庫 " + stocks[i] + " 個");
			totalPrice += (amounts[i] * prices[i]);
		}
		System.out.println("合計金額：" + totalPrice + "円");

	}
}
