import java.util.*;

public class Occurrences {

	public static void main(String[] args) {
		Scanner inputA = new Scanner(System.in);
		System.out.println("Print the word: ");
		String string1 = inputA.nextLine();
		System.out.println("Print the char to see occurences: ");
		char a = inputA.next().charAt(0);

		System.out.println(count(string1, a));

	}

	public static int count(String string1, char a) {
		int occurences = 0;
		for (int i = 0; i < string1.length(); i++) {
			if (string1.charAt(i) == a) {
				occurences++;
			}

		}

		return occurences;
	}

}
