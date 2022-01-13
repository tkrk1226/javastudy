package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];

		System.out.println("상품 가격 개수를 입력해주세요.");
		
		// 상품 입력
		for(int i = 0; i < COUNT_GOODS; i++) {
			String getGoods = scanner.nextLine();
			Goods good = new Goods(getGoods.split(" ")[0], Integer.parseInt(getGoods.split(" ")[1]), Integer.parseInt(getGoods.split(" ")[2]));
			goods[i] = good;
		}
		
		for(int i = 0; i < COUNT_GOODS; i++) {
			System.out.printf("%s(가격:%d원)이 %d개 입고 되었습니다.\n", goods[i].getName(), goods[i].getPrice(), goods[i].getCount());
		}
		
		// 자원정리
		scanner.close();
	}
}
