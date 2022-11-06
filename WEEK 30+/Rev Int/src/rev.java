import java.util.Scanner;

public class rev {
	public static void reverseDisplay(int value) {
		if (value > 9) {
			System.out.print(value % 10);
			reverseDisplay(value / 10);
		} else {
			System.out.println(value);
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Num:");
		int num = input.nextInt();
		System.out.println("Number in reverse = ");
		reverseDisplay(num);
	}
}