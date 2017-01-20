package program;

import java.io.File;
import java.util.LinkedList;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import utils.SaveToCSV;

public class Program {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", utils.DriverLocation.webdriverFolder);
		LinkedList<Result> resultsList = new LinkedList<>();
		
		//Add test cases to resultsList
		//resultsList.add(JUnitCore.runClasses(new testCases.TC_CommonElements().getClass()));		
		resultsList.add(JUnitCore.runClasses(new testCases.TC_ConsultantProfilePage().getClass()));
		
		//Save results in the file below, which will be created in main directory: "team-java"
		File file = new File("testLog.CSV");
		SaveToCSV scsv = new SaveToCSV();
		String finalMessage = "";
		
		for (Result result : resultsList) {
			if (!result.wasSuccessful()) {
				finalMessage = scsv.checkForFailures(result, finalMessage, file);
			} else {
				finalMessage = scsv.checkForSuccess(result, finalMessage, file);
			}
		}
		
		System.out.println("Tests are DONE!");
	}
}