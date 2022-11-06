import java.util.Scanner;

public class s2 {

	public static double series(double x) {
		if (x != 1) {
			return x / (2 * x + 1) + series(x - 1);
		} else {
			return x / (2 * x + 1);
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("To what repetition of the series would you like to go to?");
		double x = input.nextDouble();
		System.out.println("The number after " + x + " repetitions is: " + series(x));
	}
}