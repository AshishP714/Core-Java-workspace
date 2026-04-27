import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class StudentDeSerialzation {
	public static void main(String[] args) throws Exception {
		FileInputStream file = new FileInputStream("C:\\study material\\student.txt");
		ObjectInputStream os = new ObjectInputStream(file);
		Student s = (Student) os.readObject();
		System.out.println(s.id + " ," + s.name + " ," + s.collegeName + " ,");
		os.close();
		file.close();
	}
}
