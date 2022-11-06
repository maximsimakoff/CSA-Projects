package reverse_int;
import java.util.Scanner;
public class reverse_int {

	public static void main(String[] args) {
		//Declare Variables
		int num=0;
		//beginning of initial question
		Scanner input=new Scanner(System.in);
		System.out.println("PLEASE ENTER THE INTEGER YOU WANT TO BE IN REVERSE ORDER: ");
		num=input.nextInt();
		//end of initial question
		//start of converter
		converter a=new converter();
		a.set_num(num);
		System.out.println(a.get_order());
		//end of converter  
		
	}//end of main

}//end of class