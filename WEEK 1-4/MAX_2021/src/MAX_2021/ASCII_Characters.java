package MAX_2021;

import java.util.Scanner;

public class ASCII_Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//Main Code
		Scanner input=new Scanner(System.in);
	    System.out.print("Enter ASCII code (0-127 INTEGER): ");
	    int number=input.nextInt();
	    input.close();
	    System.out.println("Your character for ASCII code "+number+" is "+(char)number);
		//End of Code
		
	       
	    
	}//End of class

}//End of main
