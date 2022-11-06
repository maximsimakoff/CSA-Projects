import java.util.Scanner;

public class s1 {

	public static double series(double x) {
		if (x != 1) {
			return 1.0 / x + series(x - 1);
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Which repition of the series? ");
		double x = input.nextDouble();
		System.out.println("The number after " + x + " repitions is = " + series(x));
	}
}