package MAX_2021;

import java.util.Scanner;

public class Sum_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//Declare variables
		String name = "" ;
		int number = 0 ;
		int sum = 0 ;
		
		//Start of Code
		Scanner Input= new Scanner(System.in);
		System.out.println("Enter a Four Digit Number between 0 and 1000:");
		number=Input.nextInt();
		
		//Math
		while(number!=0) 
		{sum=sum+(number%10);
		number= (number/10);}
		
		System.out.println("Sum of digits:" +sum);
		
	}

}
