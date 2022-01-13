package prob04;
public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {
		
		int len = str.length() - 1;
		char [] strToChar = new char[len+1];
		for (int i = len; i > -1; i--) {
			strToChar[len - i] = str.charAt(i);
		}
		
		return strToChar;
	}

	public static void printCharArray(char[] array){
		System.out.println( array );
	}
}