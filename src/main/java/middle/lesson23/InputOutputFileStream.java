package middle.lesson23;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class InputOutputFileStream {
	private static final Logger LOGGER = Logger.getLogger(InputOutputFileStream.class.getName());

	public static void main(String[] args) {
		String inputfilePath = "myapp-log.txt";
		String outputfilePath = "outputfile.txt";
		String fileContent = "Hello world!";
		
		readFile(inputfilePath);
		writeFile(outputfilePath, fileContent);
	}

	private static void writeFile(String outputfilePath, String fileContent) {
		OutputStream input = null;
		try {
			input = new FileOutputStream(outputfilePath);
			byte[] bytes = fileContent.getBytes();
			input.write(bytes);
		} catch (IOException e) {
			LOGGER.log(Level.WARNING, e.getMessage(), e);
		} finally {
			try {
				if (input != null) {
					input.close();
				}
			} catch (IOException e) {
				LOGGER.log(Level.WARNING, e.getMessage(), e);
			}
		}
	}

	private static void readFile(String filePath) {
		InputStream input = null;
		try {
			input = new FileInputStream(filePath);
			int character = 0;
			while((character = input.read()) != -1) {
				System.out.print((char)character);
			}
		} catch (IOException e) {
			LOGGER.log(Level.WARNING, e.getMessage(), e);
		} finally {
			try {
				if (input != null) {
					input.close();
				}
			} catch (IOException e) {
				LOGGER.log(Level.WARNING, e.getMessage(), e);
			}
		}
	}

}
