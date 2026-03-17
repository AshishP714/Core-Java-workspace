package Exercise;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class DemoException {

	public static void main(String[] args) {
		try {
			FileReader f = new FileReader("c:\\temp\\dummy.txt");
		} catch (FileNotFoundException e) {
			System.out.println("Action when file is not found");
		} catch (NullPointerException e) {
			System.out.println("Action when NullPointerException");
		} catch (Exception e) {
			System.out.println("Action for exceptions other than " + "FileNotFoundException/NullPointerException");
		} finally {
			System.out.println("Inside finally block");
		}
	}
}
