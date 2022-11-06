import java.util.*;

public class Anagrams {

	public static void main(String[] args) {

		Scanner inputA = new Scanner(System.in);
		System.out.println("Enter the first word: ");
		String S1 = inputA.next();
		System.out.println("Enter the second word: ");
		String S2 = inputA.next();

		if (isAnagram(S1, S2) == true) {
			System.out.println("Anagram");
		} else
			System.out.println("NOT AN ANAGRAM \n Check to make sure the two words are the same size");

	}

	public static boolean isAnagram(String S1, String S2) {
		if (S1.length() == S2.length()) {
			int counter = 0;
			for (int i = 0; i < S1.length(); i++) {
				if (S2.indexOf(S1.charAt(i)) == -1) {
					counter = counter + 1;
				}

			}

			if (counter == 0) {
				return true;
			} else
				return false;

		} else {
			return false;

		}
	}

}
