import java.util.*;

public class Check_Substrings {

	public static void main(String[] args) {

		// 1st input is substring
		// 2nd input asks for the full word
		Scanner inputA = new Scanner(System.in);
		System.out.println("Enter substring: ");
		String sub1 = inputA.nextLine();
		System.out.println("Enter full word: ");
		String full1 = inputA.nextLine();

		int index1 = full1.indexOf(sub1);
		int index2 = index1 + sub1.length();

		String full2 = full1.substring(0, index1) + "(" + full1.substring(index1, index2) + ") + "
				+ full1.substring(index2);

		if (index1 == -1) {
			System.out.println("FALSE! " + sub1 + " is not found in " + full1);
		} else {
			System.out.println("TRUE! " + sub1 + " is found in " + full1);
		}
		System.out.println(full2);

	}

}
