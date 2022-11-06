import java.util.*;

public class small_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit = 12000;
		int n = 2;

		// Make a while loop,when population is less than 120 million run that code
		while (n * n <= limit) {
			n++;
			System.out.println("The number " + n + " is less than 12,000 when squared.");
			

		}
	}

}
