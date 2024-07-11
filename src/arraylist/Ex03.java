package arraylist;

import java.util.ArrayList;

public class Ex03 {

	public static void main(String[] args) {

		ArrayList<Book> list = new ArrayList<Book>();

		// 객체를 미리 만들고 추가
		Book book = new Book("태백산맥", "조정래");
		list.add(book);

		// 객체를 생성하면서 추가
		list.add(new Book("데미안", "헤르만 허세"));
		list.add(new Book("어떻게 살 것인가", "유시민"));

		System.out.println();

		// 일반 for문 사용
		for (int i = 0; i < list.size(); i++) {
			Book b = list.get(i);
			b.showBookInfo();
		}
		System.out.println();

		// 람다식 for문 사용
		for (Book b : list) {
			b.showBookInfo();
		}
	}

}

class Book {

	String bookName;
	String author;

	public Book(String bookName, String author) {
		super();
		this.bookName = bookName;
		this.author = author;
	}

	public void showBookInfo() {
		System.out.println(bookName + "," + author);
	}
}