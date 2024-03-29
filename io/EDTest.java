package io;

import java.io.IOException;

public class EDTest {

	public static void main(String[] args) throws IOException {
		Encryption e = new Encryption();
		e.encryption();
		Decryption d = new Decryption();
		d.decryption();
		Comparator c = new Comparator();
		c.comparator();
	}

}
