import java.util.Scanner;

public class add_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = input.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				sum = sum + i;
				System.out.println("Current Odd Value is: " + i);
			}
		}
		System.out.println("Final Result is " + sum);

	}
}
