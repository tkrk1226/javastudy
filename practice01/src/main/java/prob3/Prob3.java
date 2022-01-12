package prob3;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("숫자를 입력하세요: ");
		int num = scanner.nextInt();
		int result = 0;

		if (num % 2 == 1) {
			result = oddPatternAdd(num);
		} else {
			result = evenPatternAdd(num);
		}

		System.out.println("결과 값 : " + result);

		scanner.close();
	}

	public static int oddPatternAdd(int odd) {
		int sum = 0;

		for (int i = 1; i <= odd; i += 2) {
			sum += i;
		}

		return sum;
	}

	public static int evenPatternAdd(int even) {
		int sum = 0;

		for (int i = 0; i <= even; i += 2) {
			sum += i;
		}

		return sum;
	}
}
