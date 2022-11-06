package sort_int;
import java.util.*;
public class sort_int {

	public static void main(String[] args) {
		//declare variables
				int in_1=0;
				int in_2=0;
				int in_3=0;
		//start function code
				Scanner input = new Scanner (System.in);
				System.out.println("PLEASE ENTER 3 INTEGERS WILL BE ORDERED");
				System.out.println("ENTER INTEGER 1: ");
				in_1=input.nextInt();
				System.out.println("ENTER INTEGER 2: ");
				in_2=input.nextInt();
				System.out.println("ENTER INTEGER 3: ");
				in_3=input.nextInt();
		//end of function code
				//state answer
				class1 a = new class1();
				a.set1(in_1);
				a.set2(in_2);
				a.set3(in_3);
				a.solve();
				//answer is stated after running the above
			}
	}//end of main
