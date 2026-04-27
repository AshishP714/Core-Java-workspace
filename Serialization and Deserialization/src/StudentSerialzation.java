import java.io.FileOutputStream;

import java.io.ObjectOutputStream;

public class StudentSerialzation {

	public static void main(String[] args) throws Exception {
		Student s1 = new Student("Payal", 67, "Government college kalburgi");
		Student s2 = new Student("Neha", 68, "S.B.College");
		FileOutputStream file = new FileOutputStream("C:\\study material\\student.txt");
		ObjectOutputStream os = new ObjectOutputStream(file);
		os.writeObject(s1);
		os.writeObject(s2);
		System.out.println("ByteStream created succesfully....!");
		os.close();
		file.close();

	}

}
