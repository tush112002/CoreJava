package io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialize {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("D:\\\\\\Work_DSI\\CoreJava\\src\\\\\\\\io\\\\\\\\output1.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		System.out.println("Reading object's state from the file");
		Employee e1 = (Employee) ois.readObject();
		e1.print();
//		e.toString();
		fis.close();
		ois.close();
	}
}
