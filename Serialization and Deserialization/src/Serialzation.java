import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialzation {

	public static void main(String[] args) throws Exception {
		Emplyoee e = new Emplyoee(123, "Raj", "mumbai");
		// serialization process
		FileOutputStream file = new FileOutputStream("C:\\study material\\employeedata.txt");
		ObjectOutputStream os = new ObjectOutputStream(file);
		os.writeObject(e);
		os.close();
		file.close();
		System.out.println("File created Succesfully");
		
	}

}
