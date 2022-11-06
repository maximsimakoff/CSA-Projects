import java.util.*;

public class dis_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;

		Scanner input = new Scanner(System.in);

		System.out.println("Numbers Input by user # with repeats? ");
		n = input.nextInt();

		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Number:" + (i + 1));
			a[i] = input.nextInt();
		}

		input.close();

		System.out.println();

		for (int i = 0; i < n; i++) {
			int j = 0;
			for (j = 0; j < i; j++)
				if (a[i] == a[j])
					break;

			if (i == j)
				System.out.print(a[i] + "\t");
		}

	}

}
