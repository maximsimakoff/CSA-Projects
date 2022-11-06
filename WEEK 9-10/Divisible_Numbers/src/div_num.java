import java.util.Scanner;

public class div_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int limit = 1000;
		int start = 100;

		Scanner input = new Scanner(System.in);
		// Make a while loop,when population is less than 120 million run that code
		while (start <= limit) {

			System.out.println("NUMBER: " + start + "\n");

			// if divisible by 5 and 6
			if (start % 5 == 0 && start % 6 == 0) {
				System.out.println("The number:  " + start + " is divisible by 5 and 6" + "\n");
			}
			// if divisible by 5 or 6
			// if divisible by 5 or 6 but not both
			else if (start % 5 == 0 || start % 6 == 0) {
				System.out.println("The number:  " + start + " is divisible by 5 or 6" + "\n");
				if (start % 5 != 0) {
					System.out.println("The number:  " + start + " is divisible by 5 or 6 but not both" + "\n");
				}
				if (start % 6 != 0) {
					System.out.println("The number:  " + start + " is divisible by 5 or 6 but not both" + "\n");
				}
			}

			// if divisible by 5 or 6 but not both

			start = start + 10;
		}

	}

}
