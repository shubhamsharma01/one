package com.nucleus.Error;

//Program to initialize error log file
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.nucleus.modelPackage.*;

public class ErrorLog {
	FileWriter fileWriter;
	public ErrorLog(CustomerClass11 customerClass11) { //methor to write data in errorlog file
		try {
			fileWriter = new FileWriter("C:/Users/temp/Desktop/ErrorLog.txt",true);//Writing data in ErrorLog.txt
			PrintWriter printWriter = new PrintWriter(fileWriter);
			printWriter.format("%s\n", customerClass11);//setting format of ErrorLog File
			printWriter.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			try {
				fileWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
