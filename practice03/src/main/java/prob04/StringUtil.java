package prob04;

public class StringUtil {

	public static String concatenate(String[] strArr) {
		String msg = "";
		for(int i = 0; i < strArr.length; i++) {
			msg += strArr[i];
		}
		return msg;
	}
}
