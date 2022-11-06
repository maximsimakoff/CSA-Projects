package op_variables;

import java.util.Scanner;

public class op_variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//declare variables
				int input_num=0;
				double num5=5;
				double num6=6;
				
//start function code
			Scanner input=new Scanner (System.in);
			System.out.println("PLEASE ENTER A NUMBER YOU WANT TO BE CHECKED IF IT IS DIVISBLE BY 5 OR/AND 6=");
			System.out.println("ENTER AN INTEGER: ");
			input_num = input.nextInt();	
//end of function code
				
//start of if statement
				
			while(true) 
			{
							
				if ((input_num % 6)==0 && (input_num % 5)==0)
				{
					System.out.println(input_num+" is disvisble by both 5 and 6");
				}
				else 
				{
					System.out.println(input_num+" is not disvisble by 6 and 5"); 
				}
				
				if ( (input_num % 6)==0 || (input_num % 5)==0 )
				{
					System.out.println(input_num+" is divisble by 5 or 6");
				}
				else 
				{
					System.out.println(input_num+" is divisble by neither "); 
				}
				
				if ( (input_num % 6)==0 )
				{
				System.out.println(input_num+" is divisble by 6");
				}
				
				if ( (input_num % 5)==0 )
				{
					System.out.println(input_num+" is divisble by 5");	
				}
				
				input=new Scanner (System.in);
				input_num = input.nextInt();
				
				
			}
//end of if statement
		
		
		
		
		
		

}
}
