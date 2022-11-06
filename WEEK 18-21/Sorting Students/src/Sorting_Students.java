import java.util.*;

public class Sorting_Students {

	public static void main(String[] args) {
		Scanner inputA = new Scanner(System.in);
		System.out.println("Number of students: ");
		int nums = inputA.nextInt();
		String[] names = new String[nums];
		int[] scores = new int[nums];

		for (int i = 0; i < nums; i++) {
			System.out.println("[" + i + "] " + "Enter student Name: ");
			names[i] = inputA.next();
			System.out.println("[" + i + "] " + "Enter student Score: ");
			scores[i] = inputA.nextInt();
		}

		int[] oldscores = scores.clone();

		for (int p = 0; p < 20; p++) {
			for (int j = 0; j < scores.length - 1; j++) {
				if (scores[j] <= scores[j + 1]) {
				} else {
					int temp1 = scores[j];
					int temp2 = scores[j + 1];
					scores[j] = temp2;
					scores[j + 1] = temp1;
				}
			}

		}
		int temp = 0;

		for (int i = 0; i < nums; i++) {
			for (int j = 0; j < nums; j++) {
				if (scores[i] == oldscores[j]) {
					temp = j;
				}

			}

			System.out.println(oldscores[temp] + " " + names[temp]);
		}

	}

}
