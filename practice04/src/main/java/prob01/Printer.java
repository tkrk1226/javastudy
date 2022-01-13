package prob01;

public class Printer {

	public void println(int num) {
		System.out.println(num);
	}

	public void println(boolean bool) {
		System.out.println(bool);
	}
	
	public void println(double doub) {
		System.out.printf("%.1f\n", doub);
	}

	public void println(String str) {
		System.out.println(str);
	}
	
}
