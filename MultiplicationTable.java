// Multiplication Table :-
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

/* Output 
Enter the number for which you want the multiplication table :- 
17
1  *  1  =  17
2  *  2  =  34
3  *  3  =  51
4  *  4  =  68
5  *  5  =  85
6  *  6  =  102
7  *  7  =  119
8  *  8  =  136
9  *  9  =  153
10  *  10  =  170
*/ 