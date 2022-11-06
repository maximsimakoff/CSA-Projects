package greatest_common_denominator;
import java.util.Scanner;
public class greatest_common_denominator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//variables
		int num_1=0;
		int num_2=0;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the First integer :");
		num_1=input.nextInt();
		System.out.println("Enter the Second integer :");
		num_2=input.nextInt();
		
		gcd a = new gcd();
		a.set_num1(num_1);
		a.set_num2(num_2);
		
		System.out.println(a.get_ans());
		
		
	}

}
