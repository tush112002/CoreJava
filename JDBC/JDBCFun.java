package JDBC;
import java.io.IOException;
import java.sql.*;
import java.util.Scanner;


public class JDBCFun{
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		TestH2 th=new TestH2();
		
		Connection conn =th.init();

		Scanner sc = new Scanner(System.in);
		
		int no;
		do {
			System.out.println("Enter 1 for Insert");
			System.out.println("Enter 2 for Update");
			System.out.println("Enter 3 for Delete");
			System.out.println("Enter 4 for Display");
			no = sc.nextInt();

			switch (no) {
			case 1:
				th.insert(conn);
				break;
			case 2:
				th.update(conn);
				break;
			case 3:
				th.delete(conn);
				break;
			case 4:
				th.display(conn);
				break;
			}
		} while (no != 4);
	}
}
