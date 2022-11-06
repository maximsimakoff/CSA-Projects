import java.util.*;

public class fib_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variables
		int num1 = 0;
		int num2 = 1;
		int num3;
		int count = 10;

		System.out.print(num1 + "," + num2);

		//for-loop
		for (int i = 2; i < count; ++i) {
			num3 = num1 + num2;
			System.out.print("," + num3);
			num1 = num2;
			num2 = num3;
		}

	}

}
