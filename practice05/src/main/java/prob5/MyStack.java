package prob5;

public class MyStack {

	String[] strStack = null;
	private int top = -1;

	public MyStack(int i) {
		strStack = new String[i];
	}

	public void push(String string) {
		strStack[++top] = string;
	}

	public boolean isEmpty() {
		if (strStack == null || this.top == -1) {
			return true;
		} else {
			return false;
		}
	}

	public String pop() throws MyStackException {

		if (this.isEmpty()) {
			throw new MyStackException("stack is empty");
		}
		String result = strStack[top--];
		return result;
	}
}

class MyStackException extends Exception {

	MyStackException(String message) {
		super(message);
	}

}