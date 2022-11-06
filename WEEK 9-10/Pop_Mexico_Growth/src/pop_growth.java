import java.util.Scanner;

public class pop_growth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit = 120;
		double population = 89.2;
		int year = 1990;

		// Make a while loop,when population is less than 120 million run that code
		while (population <= limit) {
			year++;
			population = population * 1.023;
			System.out.println("The population in " + year + " is " + population);
			
			
		}

	}

}
