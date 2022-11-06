package upper_lower;
import java.util.Scanner;
public class upper_lower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variables
		char letter;
		
		//start of function
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a Letter to Convert= ");
		letter=input.next().charAt(0);
		class1 a=new class1(letter);
		System.out.println(letter+" Lowercase is= "+a.Convert(letter));
		//End of Function
	
	}//End of main

}//end of class
    