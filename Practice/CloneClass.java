package Exercise;

public class CloneClass {

	public static void main(String[] args) {
        try {
            Student s1 = new Student(101, "Amit");
            Student s2 = (Student) s1.clone();

            System.out.println(s2.id + " " + s2.name);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}