import java.util.*;

public class Vowels {

	public static void main(String[] args) {
		Scanner inputA = new Scanner(System.in);
		System.out.println("Enter a Word/String: ");
		System.out.println("Total Vowels: " + vowels(inputA.nextLine()));

	}

	public static int vowels(String S1) {
		int counter = 0;
		char[] vowellist = { 'a', 'e', 'i', 'o', 'u' };
		int[] nvowels = { 0, 0, 0, 0, 0 };
		for (int i = 0; i < S1.length(); i++) {
			for (int j = 0; j < vowellist.length; j++) {

				if (S1.charAt(i) == vowellist[j]) {
					counter = counter + 1;
					nvowels[j] = nvowels[j] + 1;
				}

			}

		}

		for (int i = 0; i < nvowels.length; i++) {
			System.out.println(vowellist[i] + ": " + nvowels[i]);
		}

		return counter;

	}

}
