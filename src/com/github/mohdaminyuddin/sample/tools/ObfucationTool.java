package com.github.mohdaminyuddin.sample.tools;

import java.io.Console;
import org.jasypt.util.text.BasicTextEncryptor;

public class ObfucationTool {
	
	public static void main(String[] args) {
		Console console = System.console();
		String enteredPassword = new String(console.readPassword("Enter encryption value : "));
		
		BasicTextEncryptor bte = new BasicTextEncryptor();
        bte.setPassword("abcDEF123");
        String en = bte.encrypt(enteredPassword);
        
		System.out.println("Encrypted value : " + en);
	}

}
