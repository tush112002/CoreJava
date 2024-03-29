package sorting;

import java.util.*;

public class StudentMarksSort implements Comparator<Student> {


	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.studentMarks > o2.studentMarks) {
			return -1;
		}
		else if(o1.studentMarks < o2.studentMarks) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
}
