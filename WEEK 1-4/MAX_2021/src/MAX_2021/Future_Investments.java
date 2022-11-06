package MAX_2021;

import java.util.Scanner;

public class Future_Investments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Declare initial variables
		
		String name="";
		
		double amount = 0;
		double interest = 0;
		
		//START OF CODE 
		
		//Initial Questions
		Scanner Input= new Scanner(System.in);
		System.out.println("What is your name:");
		name=Input.next();
		
		System.out.println("Amount of $:");
		amount=Input.nextDouble();	
		
		System.out.println("Interest Rate:");
		interest=Input.nextDouble();
		interest/=1200;
		
		System.out.println("Years:");
		int years=Input.nextInt();
		
		//Math
		double future= amount*Math.pow(1 + interest, years * 12);
		
		//Declaring terms after all math completed
		System.out.println("Name:"+name);
		System.out.println("Entered Amount:"+amount);
		System.out.println("Interest:"+interest);
		System.out.println("Number of years:"+years);
		System.out.println("Future Investment Value:"+future);
		
		//END OF CODE
		
	}//End of Class

}//End of main
