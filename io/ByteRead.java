package io;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteRead {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("D:\\\\Work_DSI\\\\CoreJava\\\\src\\\\io\\\\TestImage.jpg");
		int x = 0;
		while ((x = fis.read()) != -1) {
			System.out.print((char) x);
		}
	}
}
