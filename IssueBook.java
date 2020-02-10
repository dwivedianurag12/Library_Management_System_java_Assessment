package LibraryManagement_System;

public class IssueBook {
	int studentId;
	int bookId;

	public IssueBook(int studentId, int bookId) {
		super();
		this.studentId = studentId;
		this.bookId = bookId;
	}

	public IssueBook() {
		super();
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	@Override
	public String toString() {
		return "IssueBook [studentId=" + studentId + ", bookId=" + bookId + "]";
	}

}
