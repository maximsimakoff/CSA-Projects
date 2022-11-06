import java.util.*;

public class mode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double avg = 0;
		double total = 0;

		int numbers1 = 0;
		int actual_mode = 0;

		int numbers[] = new int[100];
		int mode[] = new int[101];
		int n = numbers.length;
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 100) + 1;
			mode[numbers[i]]++;

			total = total + numbers[i];

		}
		avg = total / numbers.length;

		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (numbers[j] > numbers[j + 1]) {
					// swap temp and arr[i]
					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
		double median = numbers[numbers.length / 2];

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + ",");
			if (i % 10 == 0)
				System.out.println();

		}

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + ",");
			if (i % 10 == 0)
				System.out.println();
		}

		for (int i = 0; i < numbers.length; i++) {
			{
				if (mode[i] > numbers1) {
					numbers1 = mode[i];
					actual_mode = i;

				}

			}

		}
		System.out.println();
		System.out.println();
		System.out.println("Mean Items in Array " + avg);
		System.out.println("Items in Array: " + numbers.length);
		System.out.println("Median: " + median);
		System.out.println("\nMode: " + actual_mode);
	}

}
