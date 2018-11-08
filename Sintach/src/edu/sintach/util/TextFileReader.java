package edu.sintach.util;


import java.io.*;

public class TextFileReader {
	
	public void textreader(String file){
		
		try {
			
			FileReader reader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(reader, 4096);
			
			String line;
			
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();
			
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}
