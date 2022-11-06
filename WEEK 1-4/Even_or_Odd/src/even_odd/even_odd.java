package even_odd;

import java.util.Scanner;

public class even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variables
		int num=0;
		
		
		//main code
		Scanner Input = new Scanner (System.in);
		
		
		
		//While start
		while (1==1)
		{
		
		System.out.println("Please enter an integer to see if it is Odd or Even: ");
		num=Input.nextInt();
		
	
		
		int output=num%2;
		
		//If the number 0 is typed START
		if (num==0) {
			System.exit(output);	
			}
		//If the number 0 is typed EXIT
		
		
		//if start
		if (output==0) {
			System.out.println("EVEN");}
		else {
			System.out.println("ODD");}
		//if end
		
		//end of main code
		
		}//While End
		
	}//End of Function 

}
