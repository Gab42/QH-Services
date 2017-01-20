package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class ReadFromFile {
	
	// Read expected input data from file
	public HashMap<String, String> setValues(String file) {
		HashMap<String, String> map = new HashMap<>();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
			String line;
			while ((line = br.readLine()) != null) {
				String[] parts = line.split("\t~\t");
				map.put(parts[0], parts[1]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return map;
	}

	// Return the file path
	public String getFilePath(String dir, String fileName) {
		return dir + fileName;
	}
	
}
