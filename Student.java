package RevisionCodes;

public class Student {
	public String name;
	public String subject;
	public int marks;

	public Student(String name, String subject, int marks) {
		this.name = name;
		this.subject = subject;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Name :- " + name + "Subject :- " + subject + "Marks :- " + marks;
	}

	public void studentRecord() {

	}
}