package prob5;

public class Prob5 {

	public static void main(String[] args) {

		for (int i = 1; i < 100; i++) {

			int tens = i / 10;
			int ones = i % 10;
			int count = 0;

			if (i >= 10) {
				if ((tens %= 3) == 0) {
					count++;
				}
			}

			if (ones != 0) {
				if ((ones %= 3) == 0) {
					count++;
				}
			}

			if (count > 0) {
				System.out.print(i + " ");
				for (int j = 0; j < count; j++) {
					System.out.print("짝");
				}
				System.out.println();
			}
		}
	}
}
