package validating_triangle;
import java.util.*;
public class validating_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//variables
		int first=0;
		int second=0;
		int third=0;
		
		
		
		//main code
		Scanner Input = new Scanner (System.in);
		System.out.println("THIS IS A TRIANGLE VALIDATOR THAT CHECKS IF YOUR TRIANGLE IS PROPER");
		System.out.println("Please input your first length: ");
		first=Input.nextInt();
		System.out.println("Please input your second length: ");
		second=Input.nextInt();
		System.out.println("Please input your third length: ");
		third=Input.nextInt();
		//end of main code
		TriangleClass a = new TriangleClass();
		a.set1(first);
		a.set2(second);
		a.set3(third);
		System.out.println(a.solve());
		System.out.println("Area: "+a.area());
	}//end of function

}//end of main
