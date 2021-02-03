package middle.lesson24;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BufferedReaderAndWriter {
	private static final Logger LOGGER = Logger.getLogger(BufferedReaderAndWriter.class.getName());

	public static void main(String[] args) {
		String inputfilePath = "myapp-log.txt";
		String outputfilePath = "myapp-log-withdate.txt";
		
		readFromConsole();
		copyFileWithDate(inputfilePath, outputfilePath);
	}

	private static void copyFileWithDate(String inputfilePath, String outputfilePath) {
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputfilePath));
				BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputfilePath))){
			String readLine;
			while((readLine = bufferedReader.readLine()) != null) {
				bufferedWriter.write("Copy date: " + Instant.now() + "\n" + readLine + "\n");
			}
		} catch (IOException e) {
			LOGGER.log(Level.WARNING, e.getMessage(), e);
		}
	}

	private static void readFromConsole() {
		Reader streamReader = new InputStreamReader(System.in);  
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(streamReader);
			System.out.println("Wprowadz komende");  
			String readLine = bufferedReader.readLine();
			System.out.println("Twoja komenda to: " + readLine);   
		} catch (IOException e) {
			LOGGER.log(Level.WARNING, e.getMessage(), e);
		} finally {
			try {
				if (bufferedReader != null) {
					bufferedReader.close();
				}
			} catch (IOException e) {
				LOGGER.log(Level.WARNING, e.getMessage(), e);
			}
		}
	}
}
