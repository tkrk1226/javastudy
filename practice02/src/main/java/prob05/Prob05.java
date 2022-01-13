package prob05;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {

			/* 게임 작성 */
			// 정답 랜덤하게 만들기

			Random random = new Random();
			int correctNumber = random.nextInt(100) + 1;
			int min = 1;
			int max = 100;
			int count = 1;
			System.out.println("수를 결정하였습니다. 맞추어 보세요");
			int num = 0;

			while (num != correctNumber) {
				System.out.printf("%d-%d\n", min, max);
				System.out.printf("%d>>", count);
				num = scanner.nextInt();

				if (correctNumber < num) {
					System.out.println("더 낮게");
					max = num;
				} else if (correctNumber > num) {
					System.out.println("더 높게");
					min = num;
				}
			}

			System.out.println("맞았습니다.");
			System.out.print("다시 하겠습니까(y/n)>>");
			String answer = scanner.next();
			if ("y".equals(answer) == false) {
				break;
			}

		}
		scanner.close();
	}

}