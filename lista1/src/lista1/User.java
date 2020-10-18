package lista1;

import java.util.HashMap;

public class User {

	public HashMap<String ,Integer> borrowedBooks;
	public int id;
	
	public User() {
		
		borrowedBooks = new HashMap<>();
		id = this.hashCode();
	}
	public void returnBook(Book book) {
		
		if(didUserBorrowBook(book)) 
				borrowedBooks.put(book.toString(), borrowedBooks.get(book.toString()) - 1);
		else
			System.out.print("User cant return book: " + book.toString() + " " 	+ "he doesn't have it" );
		
	}
	
	public void borrowBook(Book book) {
		
		if(didUserBorrowBook(book))
			borrowedBooks.put(book.toString(), borrowedBooks.get(book.toString() + 1));
		else
			borrowedBooks.put(book.toString(), 1);
		
	}
	
	public boolean didUserBorrowBook(Book book) {
		
		if(borrowedBooks.containsKey(book.toString()) && borrowedBooks.get(book.toString()) != 0)
			return true;
		else 
			return false;
	}
}
