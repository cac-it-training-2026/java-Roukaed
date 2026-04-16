package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_1 {

	public static void main(String[] args) throws IOException {

		// TODO:ここに実装
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] itemNames = new String[5];
		int[] itemPrices = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("商品" + (i + 1) + "を入力してください:>");
			itemNames[i] = br.readLine();

		}
		System.out.println("各商品の単価を順に入力してください:>");
		for (int i = 0; i < 5; i++) {
			System.out.println(itemNames[i] + "の単価:>");
			itemPrices[i] = Integer.parseInt(br.readLine());
		}

		System.out.println("登録商品一覧");
		for (int i = 0; i < 5; i++) {
			System.out.println(itemNames[i] + ":" + itemPrices[i] + "円");
		}

	}

}
