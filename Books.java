package LibraryManagement_System;

import java.util.*;

public class Books {
	int bookID;
	String bookName;

	static Map<Integer, String> mapBook = new HashMap<Integer, String>();

	public Books() {
		super();
	}

	public Books(int bookID, String bookName) {
		super();
		this.bookID = bookID;
		this.bookName = bookName;
	}

	public void addBook(int bID, String bName) {

		mapBook.put(bID, bName);
	}

	public static void displayListOfBooks() {
		
	
		System.out.println("\nList of Books:-");
		for (Map.Entry m : mapBook.entrySet()) {
			System.out.println("Book Id= " + m.getKey() + " " + "Book Name= " + m.getValue());
			
		}
		System.out.println("______________________________________________________________");
	}

	public static void deleteBook(int bID) {

		mapBook.remove(bID);
		System.out.println("Book Deleted...");
	}

	//Update Book Name:
	public static void updateBookName(int bId,String bName) {
		
		mapBook.replace(bId, bName);
		System.out.println("Book Name Updated...");
	}

	@Override
	public String toString() {
		return "Books [bookID=" + bookID + ", bookName=" + bookName + ", mapBook=" + mapBook + "]";
	}

}
