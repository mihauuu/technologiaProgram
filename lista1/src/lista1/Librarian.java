package lista1;


public class Librarian {

	public static Library library;
	
	public Librarian() {
	
		library = new Library();
	}
	
	public void lentBook(User user, Book book) {
		
		if(library.isBookInStock(book)) {
			
			library.removeFromStock(book);
			user.borrowBook(book);
		}
		else {
			
			System.out.print(book.toString() + "- librarian can't lent this book it's not in stock\n");
		}
	}
	public void receiveBook(User user, Book book) {
	
		if(user.didUserBorrowBook(book)) {
	
			user.returnBook(book);
			library.addToStock(book);
		}
		else {
			System.out.print("User can't return book which he didn't borrow\n");
			System.out.print("XD");
		}
	}
	
}