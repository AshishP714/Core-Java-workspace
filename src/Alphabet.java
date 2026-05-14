//print characters from A to Z but skip vowels
public class Alphabet {

	public static void main(String[] args) {
		for(char ch='A';ch<='Z';ch++) {
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'|| ch=='U') {
			continue;	
			}
			System.out.print(ch+" ");
		}
	}

}
