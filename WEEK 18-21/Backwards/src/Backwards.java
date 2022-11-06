import java.util.*;

public class Backwards {

	public static void main(String[] args) {

		Scanner inputA = new Scanner(System.in);
		System.out.println("Enter a Word/String: ");
		String string1 = inputA.next();

		for (int i = 0; i < string1.length(); i++) {
			System.out.print(string1.charAt(i));
		}
		System.out.println();
		for (int i = string1.length() - 1; i >= 0; i--) {
			System.out.print(string1.charAt(i));
		}

	}

}