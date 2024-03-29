package io;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Encryption {
	
	public void encryption() throws IOException {

		FileInputStream fis = new FileInputStream("D:\\Work_DSI\\CoreJava\\src\\io\\input.txt");
		FileOutputStream fos = new FileOutputStream("D:\\Work_DSI\\CoreJava\\src\\io\\output.txt");
		int key = 123;

		int data;
		while ((data = fis.read()) != -1) {
			data = data + key;
			fos.write(data);
		}
		fis.close();
		fos.close();
		System.out.println("File encrypted successfully.");

	}
}
