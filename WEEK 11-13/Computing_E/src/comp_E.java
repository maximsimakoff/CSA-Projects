import java.util.*;

public class comp_E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double e = 1.0, value = 10000.0;
		// Compute e value for i = 10000
		for (double i = 1; i <= value; i++) {

			double denominator = i;

			for (double k = i - 1; k >= 1; k--) {

				denominator *= k;

			}

			e += 1 / denominator;

		}
		// Display result
		System.out.println("The e value for i = 10000: " + e);
		// Compute e value for i = 20000
		e = 1.0;
		value = 20000.0;

		for (double i = 1; i <= value; i++) {

			double denominator = i;

			for (double k = i - 1; k >= 1; k--) {

				denominator *= k;

			}
			e += 1 / denominator;
		}
		// display result after end of for loop
		System.out.println("The e value for i = 20000: " + e);
		// Compute e value for i = 100000
		e = 0.0;
		value = 100000.0;

		for (double i = 1; i <= value; i++) {

			double denominator = i;

			for (double k = i - 1; k >= 1; k--) {

				denominator *= k;

			}

			e += 1 / denominator;

		}

		// Display results at the end of the functions and for loops

		System.out.println("The e value for i = 100000: " + e);

	}

}
