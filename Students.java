package LibraryManagement_System;

import java.util.*;

import Collections.PerComperator;

public class Students {

	int studentRollNo;
	String studentName;
	String studentBranch;

	static ArrayList<Students> student = new ArrayList<Students>();

	public Students(int studentRollNo, String studentName, String studentBranch) {
		super();
		this.studentRollNo = studentRollNo;
		this.studentName = studentName;
		this.studentBranch = studentBranch;
	}

	public int getStudentRollNo() {
		return studentRollNo;
	}

	public void setStudentRollNo(int studentRollNo) {
		this.studentRollNo = studentRollNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentBranch() {
		return studentBranch;
	}

	public void setStudentBranch(String studentBranch) {
		this.studentBranch = studentBranch;
	}

	// Add Students:
	public static void addStudent(Object std) {
		student.add((Students) std);
		System.out.println("Adddeed......");
	}

	// Display Students-
	public static void displayListOfStudents() {
		
		Collections.sort(student,new RollNoComperator());
		System.out.println("Sorted List of Students:");
		for (Students s : student) {
			System.out.println(s);
		}
		System.out.println("______________________________________________");
	}

	@Override
	public String toString() {
		return "Students [studentRollNo=" + studentRollNo + ", studentName=" + studentName + ", studentBranch="
				+ studentBranch + "]";
	}

}
