package prob02;

public class Book {

	int bookNo;
	String title;
	String author;
	int stateCode = 1;

	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
	}

	public void rent() {
		System.out.println(title + "이(가) 대여 됐습니다.");
		stateCode = 0;
	}

	public void print() {

		String msg = null;

		if (stateCode == 1) {
			msg = "대여중";
		} else {
			msg = "재고있음";
		}

		System.out.printf("책 제목:%s, 작가:%s, 대여 유무:%s\n", title, author, msg);
	}

}
