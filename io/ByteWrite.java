package io;

import java.io.FileOutputStream;
import java.io.IOException;


public class ByteWrite {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("D:\\\\Work_DSI\\\\CoreJava\\\\src\\\\io\\\\TestImage.jpg");
		String s = "This is an output message.";
		for (int i = 0; i < s.length(); i++)
			fos.write(s.charAt(i));
	}
}