package com.juan.AppDron;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DocWriter {
	private String positions;
	
	public DocWriter(String positions) {
		this.positions = positions;
	}
	
	public void writeFile() {
		try {
			FileWriter writer = new FileWriter(new File("C:\\\\Users\\\\JuanJoseGomez\\\\Desktop\\\\out.txt"));
			PrintWriter printer = new PrintWriter(writer);
			printer.print(this.positions);
			printer.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
