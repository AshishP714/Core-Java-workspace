package CodingBat;

public class LastTWo {

	    public String lastTwo(String str) {
	        if (str.length() < 2) {
	            return str;
	        }
	        return str.substring(0, str.length()-2) + str.charAt(str.length()-1) + str.charAt(str.length()-2);
	    }

	    public static void main(String[] args) {
	    	
	    	LastTWo last= new LastTWo(); 
	    	
	        System.out.println(last.lastTwo("coding")); 
	            
	    }
	}

