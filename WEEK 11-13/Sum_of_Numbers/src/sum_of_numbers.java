import java.util.*;

public class sum_of_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Variables
		int num1;
		int total=0;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter an Integer to add: ");
		num1 = input.nextInt();
		
		for(int i=1; i<=num1;i++) {
			if(i<num1) {
			System.out.print(i+" + ");
			}
			else {
			System.out.print(i+" = ");
			}
			total=total+i;
		}
System.out.println(total);
	}
}