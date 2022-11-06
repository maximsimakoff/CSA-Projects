package Guess_game;
import java.util. *;
public class Guess_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declare Variables 
		int guess=0;
		int min=0;
		int max=100;
		double num=(int)(Math.random()*max+1);
		
		//Start Main Code
		
		Scanner input=new Scanner(System.in);
		System.out.println("Guess the number: ");
		
	while (guess!=num)	
	{
		if (guess<num)	
		{
			System.out.println("Guess Higher");
		}
		else if(guess>num) 
		{
			System.out.println("Guess Lower");
		}
		guess = input.nextInt();	
		
	}
	System.out.println("Correct Answer");
		
		
		
		//End Main Code
		
		
		
	
		
		
		
	}//End of Class

}//End of Main
