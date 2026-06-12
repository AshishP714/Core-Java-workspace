import java.util.Scanner;

public class MultiplicationTable {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the number for which you want the multiplication table :- ");
        int a = sc.nextInt();
        for(int i = 1; i <= 10; i++) {
        System.out.println(i + "  *  " + i + "  =  " + a * i);
        
        }
    }
}
