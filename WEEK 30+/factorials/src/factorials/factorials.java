package factorials;

import java.util.Scanner;

public class factorials {
	public static int factorial(int x) {
		if (x > 1) {
			return x * factorial(x - 1);
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a num");
		int num = input.nextInt();
		System.out.println(num + " Factorial is : " + factorial(num));
	}
}