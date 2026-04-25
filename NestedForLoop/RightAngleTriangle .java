//*
//* *
//* * *
//* * * *
//* * * * *

public class RightAngleTriangle {

	public static void main(String[] args) {
	for(int i=1;i<=5;i++) {//row 
		for( int j=1;j<=i;j++) {//column when j=1 condition check as per i value in first iteration is 1 
			//it check with j and condition matches then it print star again it check when j=2 but in this 
			//condition does not match so loop exist and change line again this same pattern happen.
			System.out.print("* ");//print star in one line
		}
		System.out.println(" ");//changees line
	}
	}

}
