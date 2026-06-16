package RevisionCodes;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MainClass{

	public static void main(String[] args) throws Exception{
		//Student s = new Student("Ashis", "h", 65);
		
		Student[] student = new Student[4];
		
		student[0] = new Student("Ashish", "Java Developer", 394);
		student[1] = new Student("Ashwini", "Zoho Developer", 470);
		student[2] = new Student("Tushar", "Senior Java Developer", 485);
		student[3] = new Student("Abhijeet", "DevOps Engener", 455);
		
		Runnable r = () -> System.out.println("Multithreading involve...");
		
		Thread t = new Thread(r);
		t.start();
		t.sleep(1000);
		
		System.out.println(Arrays.toString(student));
	}
}