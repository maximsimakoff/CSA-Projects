package MAX_2021;

import java.util.*;

public class program_C_to_F {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//variables
 int choice=0;
 double temp=0.0;
 double celsius=0.0;
 double fahrenheit=0.0;

	
//Code Body
//Questions
	Scanner Input= new Scanner(System.in); 
	System.out.println("Enter Your Temperature");
	temp=Input.nextDouble();
	
	System.out.println("To Convert from Celsius to Fahrenheit Click key '1' and To convert from Farenheit to Celsius CLick key '2' ");
	
	choice=Input.nextInt();
//MATH
	

		celsius=((temp*1.8)+32);
		fahrenheit=((temp-32)*5/9);
	//C to F
	if(choice==1) {
		;}
	//F to C
	if(choice==2) {
		;}
		
	System.out.println("Temperature"+temp);	
	}

}
