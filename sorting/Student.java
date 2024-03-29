package sorting;

public class Student implements Comparable<Student> {
	
	int studentRollNo;
    String studentName;
    double studentMarks;
    
    public Student(){
    	
    }

	public Student(int studentRollNo, String studentName, double studentMarks) {
		this.studentRollNo = studentRollNo;
		this.studentName = studentName;
		this.studentMarks = studentMarks;
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

	public double getstudentMarks() {
		return studentMarks;
	}

	public void setstudentMarks(double studentMarks) {
		this.studentMarks = studentMarks;
	}
    
    @Override
	public String toString() {
		return "Student [studentRollNo=" + studentRollNo + ", studentName=" + studentName + ", studentMarks=" + studentMarks + "]";
	}
    
    //st1.comapreTo(st2)
    public int compareTo(Student s) {
    	
    	if(this.studentRollNo > s.studentRollNo) {
    		return 1;
    	}
    	else if(this.studentRollNo < s.studentRollNo) {
    		return -1;
    	}
    	else {
    		return 0;
    	}
    	
    }

}
