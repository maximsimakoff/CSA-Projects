import java.util.*;

public class count_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Variables
		int number = 0;
		int total = 0;
		int count = 0;
		int positive = 0;
		int negative = 0;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter Integer: ");
		number=input.nextInt();
		while (number!= 0) {
			total= total+number;
			count=count+1; 
			// if loop to count the positive and negatives
			if (number > 0) {
				positive++;
			} else if (number < 0) {
				negative++;
			}
			System.out.println("Enter Integer: ");
			number=input.nextInt();
		}
			float average=total/(float)count;
			System.out.println("Number of positives: " + positive);
			System.out.println("Number of negatives: " + negative);
			System.out.println("Total: " + total);
			System.out.println("Average: " + average);
		
	}

}
