import java.util.*;

public class above_below_average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// double vars
		double avg = 0;
		double total = 0;

		// int vars
		int nums[] = new int[10];
		int n = nums.length;
		int num1 = 0;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter Numbers for Array: ");
		for (int i = 0; i < n; i++) {
			nums[i] = input.nextInt();
			total = total + nums[i];
		}
		avg = total / nums.length;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= avg) {
				System.out.print(nums[i] + "\t");
			}
		}
		System.out.println("These Numbers are above the Mean/Average: " + avg);
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] <= avg) {
				System.out.print(nums[i] + "\t");
			}
		}
		System.out.println("These Numbers are below the Mean/Average " + avg);
	}

}
