package prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("수를 입력하시오 : ");
		int checkNum = scanner.nextInt();
		String msg = null;

		if ((checkNum % 3 == 0)) {
			msg = "3의 배수입니다.";
		} else {
			msg = "3의 배수가 아닙니다.";
		}
		System.out.println(msg);
		scanner.close();
	}
}
