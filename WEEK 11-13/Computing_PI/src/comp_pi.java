import java.util.*;

public class comp_pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		// computing pi variables
		double numerator = 1;
		double denominator = 3;
		double pi = 1;
		int its = 0; // this variable is the user input

		System.out.println("How many iterations do you want: ");
		its = input.nextInt();

		for (int i = 1; i <= its; i++) {

			if (i % 2 == 1) {
				pi = pi - numerator / denominator;
			} else {
				pi = pi + numerator / denominator;
			}
			denominator = denominator + 2;
		}
		//output print
		System.out.print("There are " + its + " iterations, and the answer is " + pi * 4);

	}

}
