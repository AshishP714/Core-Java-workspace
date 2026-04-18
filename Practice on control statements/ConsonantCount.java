//write a java program to count consonant of given string
import java.util.Scanner;
public class ConsonantCount{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str="goodmorning";
		int length=str.length();
		System.out.println("length of given String is ="+length);
		int count=0;
		for(int i=0;i<length;i++) {
			char ch=str.charAt(i);
			if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u') {
				count++;
			}
			
		}
		System.out.println("count of String is ="+count);
		sc.close();
	}
}
