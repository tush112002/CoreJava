package treesort;

import java.util.TreeSet;

import sorting.Student;

public class TestStudent {
	public static void main(String[] args) {
		
		Student st1 = new Student(1,"John",98.00);
		Student st2 = new Student(12,"Roman",94.00);
		Student st3 = new Student(7,"Dean",97.00);
		Student st4 = new Student(4,"Seth",80.00);
		
		TreeSet<Student> set = new TreeSet<>();
		set.add(st1);
		set.add(st2);
		set.add(st3);
		set.add(st4);
		
		System.out.println(set);
	}
}
