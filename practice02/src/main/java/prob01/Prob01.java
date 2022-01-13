package prob01;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in  );

		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };

		System.out.print("금액 : ");
		int getMoney = scanner.nextInt();
		
		System.out.println();
		
		for(int i = 0; i < MONEYS.length; i++) {
			int check = getMoney / MONEYS[i];
			System.out.printf("%d원 : %d개\n", MONEYS[i], check);
			getMoney -= MONEYS[i] * check;
		}
		scanner.close();
 	}
}