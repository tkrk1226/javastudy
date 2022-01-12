package prob2;

public class Prob2 {
	public static void main(String[] args) {
		for(int i = 1; i < 10; i++) {
			printTenNumbers(i);
		}
	}
	
	public static void printTenNumbers(int startNum) {
		int endNum = startNum + 10;
		for(int i = startNum; i < endNum; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}	
}
