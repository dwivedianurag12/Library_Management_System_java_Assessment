package LibraryManagement_System;

import java.util.*;

import Library.IssueBook;

public class LibraryMain {
	public static void main(String... args) {

		ArrayList<IssueBook> issue = new ArrayList<IssueBook>();

		System.out.println("------------------------------------Libray Management System--------------------------");

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.println("1.Add Book\n" + "2.Add Student \n" + "3.Update Book \n" + "4.Delete Book \n"
					+ "5.Issue Book To Students\n" + "6.Display List of Books \n" + "7.Display List Of Students\n"
					+ "8.Search Student By Id and display List Of Books Issued to Student\n"
					+ "9.Search Book By Id and display List Of Student Books has Issued\n" + "10.Exit");

			System.out.println("\nChoose an Option to Perform Operation:");
			int choice = sc.nextInt();

			switch (choice) {

			case 1: // To Add Book:
				System.out.println("Enter Book ID:");
				int bID = sc.nextInt();
				System.out.println("Enter Book Name:");
				String bName = sc.next();
				Books b1 = new Books(bID, bName);
				b1.addBook(bID, bName);
				break;

			case 2: // To Add Student:
				System.out.println("Enter Sudent Roll Number: ");
				int sRollNo = sc.nextInt();
				System.out.println("Enter Student Name: ");
				String sName = sc.next();
				System.out.println("Enter Student Branch: ");
				String sBranch = sc.next();

				Students st = new Students(sRollNo, sName, sBranch);
				st.addStudent(st);
				break;

			case 3: // Update Book:
				System.out.println("Enter book id");
				int bid = sc.nextInt();
				System.out.println("Enter New Book Name to Update: ");
				String bname = sc.next();
				Books.updateBookName(bid, bname);
				break;

			case 4: // Delete Book by Id:
				System.out.println("Enter book id");
				int bId = sc.nextInt();
				Books.deleteBook(bId);
				break;

			case 5: // Issue Book to Student:
				System.out.println("Enter Student ID:");
				int sid = sc.nextInt();
				System.out.println("Enter Book ID:");
				int bd = sc.nextInt();
				IssueBook issueBook = new IssueBook(sid, bd);
				issue.add(issueBook);
				System.out.println();
				System.out.println("Book Issued...");
				System.out.println();

				break;

			case 6: // Display List of Books:
				Books.displayListOfBooks();
				break;

			case 7: // Display List of Students:
				Students.displayListOfStudents();
				break;

			case 8: // Search Student By Id and display List Of Books Issued to Student

				System.out.println("Enter Student Id to Search:");
				int ssid = sc.nextInt();

				for (IssueBook s : issue) {
					if (ssid == s.getStudentId()) {
						System.out.println(s);
					}

				}
				break;

			case 9: // Search Book By Id and display List Of Student Books has Issued:

				System.out.println("Enter Book Id to Search:");
				int bbid = sc.nextInt();

				for (IssueBook s : issue) {
					if (bbid == s.getBookId()) {
						System.out.println(s);
					}
				}
				break;
			case 10: // To Exit from Application:
				System.exit(0);
				break;
			default:
				System.out.println("Wrong Choice!");
			}
		}
	}
}