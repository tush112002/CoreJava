package io;

import java.io.File;

public class FileDetails {
	
	public static void main(String[] args) {
		
		File file = new File("D:\\Work_DSI\\CoreJava\\src\\io\\input.txt");
		System.out.println("File exists: " + file.exists());
		System.out.println("File Path: " + file.getAbsolutePath());
		System.out.println("File readable: " + file.canRead());
		System.out.println("File writable: " + file.canWrite());
		System.out.println("File executable: " + file.canExecute());
		System.out.println("File length: " + file.length());
		
		
		System.out.println("--------------------------------------------------");
		
		File file1 = new File("D:\\Work_DSI\\CoreJava\\src\\io\\input1.text");
		System.out.println("File exists: " + file1.exists());
		System.out.println("File Path: " + file1.getAbsolutePath());
		System.out.println("File readable: " + file1.canRead());
		System.out.println("File writable: " + file1.canWrite());
		System.out.println("File executable: " + file1.canExecute());
		System.out.println("File length: " + file1.length());
		
	}
}