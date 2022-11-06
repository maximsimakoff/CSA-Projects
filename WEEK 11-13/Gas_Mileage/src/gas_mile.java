import java.util.*;

public class gas_mile {

	public static void main(String[] args) {
		// variables
		int mrange;
		double mrangeval;
		double gprice;
		int tempmilerange;
		double costmilenew;
		double costgal;
		double total;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the mile range: ");
		mrange = scanner.nextInt();

		System.out.println("Enter the mile range increase: ");
		mrangeval = scanner.nextDouble();

		System.out.println("Enter the original cost of a gallon of gas: ");
		gprice = scanner.nextDouble();

		System.out.printf("Mile | Cost Gallon | Cost trip \n");
		tempmilerange = mrange;

		costmilenew = 0;

		for (int i = 0; i <= 10; i++) {
			if (i == 0) {
				costmilenew = 0.0;
				System.out.println("" + tempmilerange + " " + gprice + " " + (gprice * tempmilerange));
			} else {
				costmilenew += mrangeval;
				costgal = costmilenew + gprice;
				tempmilerange += tempmilerange;
				total = costgal * tempmilerange;
				System.out.println("" + tempmilerange + " " + costgal + " " + total);
			}
		}
	}

}
