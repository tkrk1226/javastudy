package prob02;

import java.util.Scanner;

public class Prob02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] intArray = new int[ 5 ];
		double sum = 0;
		int len = intArray.length;
		
		System.out.printf("%d개의 숫자를 입력하세요.\n", len);
		for(int i = 0; i < len; i++) {
			intArray[i] = scanner.nextInt();
		}
		
		for(int i = 0; i < len; i++) {
			sum += intArray[i];
		}
		
		System.out.printf("평균은 %.1f 입니다.", sum / len);
		
		
		/* 자원정리 */
		scanner.close();
	}
}
