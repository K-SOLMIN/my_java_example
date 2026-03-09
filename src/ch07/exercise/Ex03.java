package ch07.exercise;

import java.util.Arrays;
import java.util.Comparator;

public class Ex03 {
	public static void main(String[] args) {
		Book b1 = new Book(15000);
		Book b2 = new Book(50000);
		Book b3 = new Book(20000);
		
		Book[] books = new Book[3];
		books[0] = b1;
		books[1] = b2;
		books[2] = b3;
		 
		Arrays.sort(books,
			new Comparator<Book>() {
				@Override
				public int compare(Book pre, Book next) {
					return pre.price - next.price;
				}
			}
		);
		
		for(Book book : books) {
			System.out.println(book);
		}
	}
}

class Book {
	int price;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int price) {
		super();
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [price=" + price + "]";
	}
	
}
