package num_digits;

import java.util.Scanner;

public class num_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaring integer object for user manipulations
		Integer input_num;
		Integer max = 10000;
		Integer min = 0;

		Scanner input = new Scanner(System.in);
		System.out.println("CALCULATE HOW MANY DIGITS YOUR INTEGER HAS");
		System.out.println("ENTER AN INTEGER BETWEEM 0-10,000: ");

		input_num = input.nextInt();

		if ((input_num > max) || (input_num < min)) {
			System.out.println("Quitting program");
			System.exit(1);
		} else if (input_num.toString().length() > max.toString().length()) {
			System.out.println(input_num + " has exceeded digit(s) allowed");
			System.exit(1);
		}
		// keep looping indefinitely and asking for user input
		while (true) {
			System.out.println(input_num + " has " + input_num.toString().length() + " digit(s)\n");
			input = new Scanner(System.in);
			input_num = input.nextInt();

		}

	}

}
