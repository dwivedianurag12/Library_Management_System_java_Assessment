package LibraryManagement_System;

import java.util.Comparator;

public class RollNoComperator implements Comparator{

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		Students s1=(Students)arg0;
		Students s2=(Students)arg1;
		
		if(s1.getStudentRollNo()==s2.getStudentRollNo()) {
			return 0;
		}
		else if(s1.getStudentRollNo()>s2.getStudentRollNo()){
			return 1;
		}
		else {
			return -1;
		}
	}

}
