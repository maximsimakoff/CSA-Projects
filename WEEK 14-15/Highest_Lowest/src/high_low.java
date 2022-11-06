import java.util.*;

public class high_low {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number;
		int temp;

		// User inputs the array size
		Scanner scan = new Scanner(System.in);
		System.out.print("Number of elements in the array? : ");
		number = scan.nextInt();

		int num[] = new int[number];
		Random rand = new Random();
		for (int i = 0; i < number; i++) {
			num[i] = rand.nextInt(100);
			;
		}
		scan.close();
		for (int i = 0; i < number; i++) {
			for (int j = i + 1; j < number; j++) {
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		System.out.print("Array Elements Decreasing to Increasing Order: ");
		for (int i = 0; i < number - 1; i++) {
			System.out.print(num[i] + ", ");
		}
		System.out.print(num[number - 1]);
	}
}
