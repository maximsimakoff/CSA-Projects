import java.util.*;

public class rev_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = new int[10];
		int n = nums.length;

		Scanner input = new Scanner(System.in);
		System.out.println("Numbers for array: ");
		System.out.println("");
		for (int i = 0; i < n; i++) {
			nums[i] = input.nextInt();
		}
		for (int i = 0; i < n; i++) {
			System.out.print(nums[i] + ", ");
		}
		System.out.println();
		System.out.println();
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(nums[i] + ", ");
		}

	}

}
