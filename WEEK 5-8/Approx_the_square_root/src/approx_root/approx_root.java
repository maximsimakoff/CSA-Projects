package approx_root;
import java.util.*;
public class approx_root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//variables
		double number=0;
		
		//initial question
		Scanner input=new Scanner(System.in);
		System.out.println("THIS PROGRAM APPROXIMATES THE SQUARE ROOT OF NUMBERS");
		System.out.println("Enter an Integer: ");
		number=input.nextDouble();
		
		AprxSqrt a = new AprxSqrt();
		a.set_num(number);
		
		//printing answer
		System.out.println("The square root of "+number+ " is: ");
		System.out.println(a.get_ans());
		
		
	}

}
