import java.io.Serializable;

public class Student implements Serializable {
	String name;
	int id;
	String collegeName;

	public Student(String name, int id, String collegeName) {

		this.name = name;
		this.id = id;
		this.collegeName = collegeName;
	}

}
