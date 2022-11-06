package numeric_grade;
import java.util.*;
public class numeric_grade {
	
	
	public numeric_grade() {}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		inputFN(args);
			
	}//End of Function
	public static void inputFN(String[] args) 
	{
		//Declare variables
				double grade=0;
				Scanner input;
				
				
			
				try {
					//Main Code
					System.out.println("TRANSFER NUMERICAL GRADE TO LETTER");
					System.out.println("Please Input Your Grade: ");
					input = new Scanner(System.in);
					
					grade=input.nextDouble();
					
					
					if (grade>=90&&grade<=100)
					{
					System.out.println("A");	
					}
					
					if (grade>=80&&grade<=89)
					{
					System.out.println("B");
					}
					
					if (grade>=70&&grade<=79)
					{
					System.out.println("C");	
					}

					if (grade>=60&&grade<=69)
					{
					System.out.println("D");	
					}
					
					if (grade>=1&&grade<=59)
					{
					System.out.println("F");	
					}
					//End of Main Code
				} catch (Exception e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					System.out.println("Your input value is not a number, please try again");
				    input = new Scanner(System.in);
					
				}
				finally {System.exit(0);}
				
				
					
	}

}//End of Main
