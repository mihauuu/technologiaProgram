package lista1;

import java.util.HashMap;

public class Library {
	
	public HashMap <String, Integer> stock;
	public HashMap<Integer, User> users;
	
	public Library() {
	
		stock = new HashMap<>();
		users = new HashMap<>();
	}

	public void addToStock(Book book) {
		
		if(isBookInStock(book)) {
			stock.put(book.toString(), stock.get(book.toString()) + 1);
		}
		else {
			stock.put(book.toString(), 1);
		}
	}
	
	public void removeFromStock(Book book) {
		
		if(isBookInStock(book)) {
			stock.put(book.toString(), stock.get(book.toString()) - 1);
		}
		else {
			System.out.print("There's no" + " " + book.toString() + " in stock \n");
		}
	}
	
	public boolean isBookInStock(Book book) {
		
		if(stock.containsKey(book.toString()) && stock.get(book.toString()) > 0)
			return true;
		else 
			return false;
	}
	
	public void addUser(User user) {
		
		users.put(user.id, user);
	}
}
