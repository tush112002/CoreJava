package io;

import java.io.FileInputStream;
import java.io.IOException;

public class Comparator {
	
	public boolean comparator() throws IOException {

		FileInputStream fis1 = new FileInputStream("D:\\Work_DSI\\CoreJava\\src\\io\\input.txt");
		FileInputStream fis2 = new FileInputStream("D:\\Work_DSI\\CoreJava\\src\\io\\output.txt");

		int data1, data2;
		while ((data1 = fis1.read()) != -1 && (data2 = fis2.read()) != -1) {
			if (data1 != data2) {
				fis1.close();
				fis2.close();
				return false;
			}
		}

		fis1.close();
		fis2.close();
		return true;
	}

}
