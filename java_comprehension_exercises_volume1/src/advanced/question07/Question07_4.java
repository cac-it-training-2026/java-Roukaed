package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_4 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 登録済み商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 100, 200, 300, 400, 500 };
		// 購入数（変更不可）
		int[] amounts = new int[5];

		// TODO: 実装ここから
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int totalPrice = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println(itemNames[i] + "の購入数>");
			amounts[i] = Integer.parseInt(br.readLine());
			totalPrice += amounts[i] * prices[i];
		}
		if (totalPrice >= 5000) {
			int reducedPrice = (int) (totalPrice * 0.9);
			int PriceWithTaxD = (int) (reducedPrice * 1.1);
			System.out.println("割引前合計：" + totalPrice + "円");
			System.out.println("割引適用(10%OFF)：" + reducedPrice + "円");
			System.out.println("税込合計：" + PriceWithTaxD);
		} else {
			int PriceWithTax = (int) (totalPrice * 1.1);
			System.out.println("割引前合計：" + totalPrice + "円");
			System.out.println("税込合計：" + PriceWithTax);
		}

	}

}
