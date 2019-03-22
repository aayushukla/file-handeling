package com.capgemini.files.client;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileHandelingDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * File file = new File(
		 * "C:\\Users\\aayshukl\\Downloads\\collection-assignments\\src\\com\\capgemini\\client\\TreeSetDemo.java"
		 * ); System.out.println(file.exists());
		 */

		/*
		 * File file=new File("test.txt"); if(!file.exists()) { file.createNewFile();
		 * System.out.println("file created succesfully"); } PrintWriter writer= new
		 * PrintWriter(new FileWriter(file,true)); writer.println("hello");
		 * writer.println("how"); writer.println("you"); writer.println("doin?");
		 * 
		 * writer.close();
		 */
		/*
		 * FileReader reader= new FileReader(
		 * "C:\\Users\\aayshukl\\Downloads\\inheritance-assignments-master\\src\\com\\capgemini\\inheritance\\main\\bankAccount.java"
		 * ); BufferedReader br=new BufferedReader(reader);
		 * 
		 * PrintWriter write= new PrintWriter("BankAccount.java"); String content;
		 * 
		 * while((content=br.readLine()) != null){ System.out.println(content);
		 * write.println(content); }
		 * 
		 * write.close(); br.close(); reader.close();
		 */
		
		/*
		 * File windowsDirectory= new File("c:\\windows");
		 * System.out.println(windowsDirectory.isDirectory()); String
		 * content[]=windowsDirectory.list();
		 * 
		 * for(String s :content) { System.out.println(s); }
		 */
		
		File newDir= new File("myDir");
		if(! newDir.exists())
		{
			newDir.mkdir();
		}
		File file = new File(newDir, "myfile.txt");
		if(!file.exists())
		{
			file.createNewFile();
			System.out.println("file created succesfully");
		}
	}
}
