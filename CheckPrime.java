//Check number is Prime or not

public class CheckPrime {
public static void main(String[] args) {

    	int number = 13;
    	boolean isPrime = true;
    
    	if(number <= 1) {
    	  isPrime = false;
    	}
	
    	for(int i = 2; i < number; i++) {
    	    if(number % i == 0) {
    		isPrime = false;
    		break;
    	    }
    	}

    	if(isPrime == true) {
    	   System.out.println("The number is prime");
    	} else {
    	   System.out.println("The number is not prime");
    	}
    }
}