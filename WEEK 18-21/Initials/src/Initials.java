import java.util.*;

public class Initials {

	public static void main(String[] args) {
		Scanner inputA = new Scanner(System.in);
		String FullName = "Maxim Oleg Simakoff";
		String space = " ";
		System.out.println("Please enter your name (up to 1 middle name): ");
		FullName = inputA.nextLine();
		int index1 = FullName.indexOf(space, 1);
		int index2 = FullName.indexOf(space, index1 + 1);
		// System.out.println(index1 + " " + index2);

		String FirstName = FullName.substring(0, index1);
		String MiddleName = FullName.substring(index1 + 1, index2);
		String LastName = FullName.substring(index2 + 1);

		System.out.println("First: " + FirstName);
		System.out.println("Middle: " + MiddleName);
		System.out.println("Last: " + LastName);

		char FN = FirstName.charAt(0);
		char MN = MiddleName.charAt(0);
		char LN = LastName.charAt(0);

		// printing below
		System.out.println("Full name: " + FullName);
		System.out.println("Initials: " + FN + MN + LN);

	}

}
