package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class SaveToCSV {
	
	//Save the results in CSV file
	public void toCSV(String finalMessage, File file){
		String[] strArray = finalMessage.split("~");
		PrintWriter pw = null;
		try {
		    pw = new PrintWriter(file);
		    StringBuilder sb = new StringBuilder();
		    String columns = "TC,Expected,Actual,Status";
		    sb.append(columns +"\n\n");
		    for (int i = 0; i < strArray.length; i++) {
		    	if (i < strArray.length - 1) {
		    		sb.append(strArray[i] + ",");
				} else {
					sb.append(strArray[i]);
				}
			}
		    sb.append("\n");
			pw.write(sb.toString());
		} catch (FileNotFoundException e) {
		    e.printStackTrace();
		} finally {
			pw.close();
		}
	}
	
	//If there are any failures, write them in the CSV file
	public String checkForFailures(Result result, String finalMessage, File file){
		for (Failure failure : result.getFailures()) {
			String temp = failure.getMessage();
			temp = temp.replace("Expected: ", "");
			temp = temp.replace("     but: was ", "");
			String[] stringArray = temp.split("\n");
			for (String s : stringArray){
				finalMessage += s + "~";
			}
			finalMessage += "FAILED\n";
			toCSV(finalMessage, file);
		}
		return finalMessage += "\n";
	}
	
	//If there are no failures, write that all tests passed in single row
	public String checkForSuccess(Result result, String finalMessage, File file){
		finalMessage = "All~~~PASSED\n";
		toCSV(finalMessage, file);
		return finalMessage += "\n";
	}
	
}
