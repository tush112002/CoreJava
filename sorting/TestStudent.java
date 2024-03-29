package sorting;
import java.util.*;

public class TestStudent {
	public static void main(String[] args) {
		
		Student st1 = new Student(1,"John",98.00);
		Student st2 = new Student(12,"Roman",94.00);
		Student st3 = new Student(7,"Dean",97.00);
		Student st4 = new Student(4,"Seth",80.00);
		
		List<Student> list = new ArrayList<>();
		
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
		
		System.out.println("Students are Sorted on the basis of rollNo's:");
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println("Students are Sorted on the basis of Marks:");
		Collections.sort(list, new StudentMarksSort());
		System.out.println(list);
		
		Comparator<Student> studentMarksSort = (o1,o2) -> {
			
			if(o1.studentMarks > o2.studentMarks) {
				return 1;
			}
			else if(o1.studentMarks < o2.studentMarks) {
				return -1;
			}
			else {
				return 0;
			}
			
		};
		
		
		System.out.println("Students are Sorted on the basis of (Assending) Marks Using Lambda Function:");
		Collections.sort(list, studentMarksSort);
		System.out.println(list);
		
	}
}
