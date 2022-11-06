import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner inputA = new Scanner(System.in);
		System.out.println("Enter a Word or String: ");
		String string1 = inputA.nextLine();
		String string2 = "";
		String string3 = "";

		for (int i = 0; i < string1.length(); i++) {
			char char1 = string1.charAt(i);
			if (char1 != ' ') {
				string2 = string2 + char1;

			}
		}

		for (int j = string1.length() - 1; j >= 0; j--) {
			char char2 = string1.charAt(j);
			if (char2 != ' ') {
				string3 = string3 + char2;

			}

		}

		System.out.println(string2);
		System.out.println(string3);

		if (string2.equals(string3)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
	}

}
