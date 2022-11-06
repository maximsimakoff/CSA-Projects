package MAX_2021;

import java.util.Scanner;

public class C_to_F {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables
			int option1 = 0;
			double Celsius;
			double Fahrenheit;
				
		// start of code
		while (option1!=1&&option1!=2)
			
		{//while start
		Scanner inputA = new Scanner (System.in);
		System.out.print("Select option (1) C to F or (2) F to C.");
		option1 = inputA.nextInt();
		}//while end
		
		if (option1==1)
			
		{//if start
		Scanner inputC = new Scanner (System.in);
		System.out.println("Enter Celsius: ");
		Celsius = inputC.nextDouble();
		Fahrenheit = (Celsius * 9/5 + 32);
		System.out.println(Celsius + "C is " + Fahrenheit + "F.");
		}//if end
		
		if (option1==2)
			
		{//if start
		Scanner inputF = new Scanner (System.in);
		System.out.println("Enter Fahrenheit: ");
		Fahrenheit = inputF.nextDouble();
		Celsius = (Fahrenheit - 32) *5/9;
		System.out.println(Fahrenheit + "F is " + Celsius + "C.");
		}//if end
		
	}
	}
