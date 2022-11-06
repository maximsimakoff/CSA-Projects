package sort_3;

import java.util.Scanner;

public class sort_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//declare variables
		int input_1=0;
		int input_2=0;
		int input_3=0;
		
//start function code
		Scanner input = new Scanner (System.in);
		System.out.println("PLEASE ENTER 3 INTEGERS WILL BE ORDERED");
		System.out.println("ENTER INTEGER 1: ");
		input_1=input.nextInt();
		System.out.println("ENTER INTEGER 2: ");
		input_2=input.nextInt();
		System.out.println("ENTER INTEGER 3: ");
		input_3=input.nextInt();
//end of function code

		int temp=0;
		if (input_1 > input_2) 
		{
			temp = input_2;
			input_2 = input_1;
			input_1 = temp;
		}
		if (input_2 > input_3) 
		{
			temp = input_3;
			input_3 = input_2;
			input_2 = temp;
		}
		if (input_1 > input_2) 
		{
			temp = input_2;
			input_2 = input_1;
			input_1 = temp;
		}

		System.out.println(input_1 +","+ input_2 +","+ input_3);
	}

}
