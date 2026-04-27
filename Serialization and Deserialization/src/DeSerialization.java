import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerialization {

	public static void main(String[] args)throws Exception {
		
		// deserialization process
		FileInputStream file = new FileInputStream("C:\\study material\\employeedata.txt");
		ObjectInputStream os = new ObjectInputStream(file);
          Emplyoee e=(Emplyoee)os.readObject();
		
		System.out.println(e.empId+" "+e.empName+" "+e.empName+" ");
		os.close();
		file.close();
            
	}

}
