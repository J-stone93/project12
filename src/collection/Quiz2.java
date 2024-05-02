package collection;

import java.util.ArrayList;

public class Quiz2 {

	public static void main(String[] args) {
		
		ArrayList<Book> list = new ArrayList<Book>();
		
		Book book1 = new Book(1001, "자바프로그래밍");
		Book book2 = new Book(1002, "스프링");
		Book book3 = new Book(1003, "DB구현과설계");
		
		list.add(new Book(1001, "자바프로그래밍"));
		list.add(new Book(1002, "스프링"));
		list.add(new Book(1003, "DB구현과설계"));
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		list.clear();
		
//		list.remove(2);
//		list.remove(1);
//		list.remove(0);
//		System.out.println(list);
//		
		for (int i = list.size() - 1; i >= 0; i--) {
			list.remove(i);
		}
		System.out.println(list.toString());
		
		
	}

}

class Book {
	
	int bookNum;
	String bookTitle;
	
	public Book(int bookNum, String bookTitle) {
		super();
		this.bookNum = bookNum;
		this.bookTitle = bookTitle;
	}

	@Override
	public String toString() {
		return "Book [bookNum=" + bookNum + ", bookTitle=" + bookTitle + "]";
	}

	
}







