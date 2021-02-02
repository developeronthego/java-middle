package middle.lesson20;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CatchUsage {

	public static void main(String[] args) throws FileNotFoundException, IOException {
//		ArrayList<String> list = null; 
//		list.get(0); <- will produce nullpointer exception
		
		try {
			ArrayList<String> list = null;
			list.get(0);
		} catch (Exception e) {
			System.out.println("Nullpointer was catched.");
		}
		
		try {
		     FileReader file = new FileReader("c:\\somefile.txt");
		} catch (FileNotFoundException e) {
		     e.printStackTrace();
		}
		
		fileFacade();
		fileFacadeFinally();
	}
	
	private static void fileFacade() throws FileNotFoundException {
		try {
			FileReader file = new FileReader("c:\\somefile.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new FileNotFoundException();
		}
	}
	
	private static void fileFacadeFinally() throws IOException {
		FileReader file = null;
		try {
			file = new FileReader("c:\\somefile.txt");
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} finally {
			file.close();
		}
	}

}
