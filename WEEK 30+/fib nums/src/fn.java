import java.util.Scanner;

public class fn {
	public static int fibonacci(int x) {
		if (x == 0) {
			return 0;
		} else if (x == 1) {
			return 1;
		} else {
			return fibonacci(x - 1) + fibonacci(x - 2);
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Which number in the Fibonacci sequence would you like to find?");
		int x = input.nextInt() - 1;
		System.out.println("The " + (x + 1) + "the fibonacci number is: " + fibonacci(x));
		input.close();
	}
}