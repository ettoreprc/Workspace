package com.mainpackage.builder;

import java.io.File;
import java.io.FileOutputStream;

import org.w3c.dom.Document;


public class Client {

	public static void main(String[] args) throws Exception {
//		Document documento = new Document (); 
		File file = new File("C:\\Users\\Ettor\\eclipse-workspace\\csse120\\Java_Builder\\src");
		file.createNewFile() ; 
		FileOutputStream fop = new FileOutputStream(file);
	}
}
