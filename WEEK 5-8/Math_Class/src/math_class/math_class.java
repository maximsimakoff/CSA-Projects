package math_class;
import java.util.*;
import java.util.Scanner;

public class math_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variables
			int deg=1;	
				
				//initial question
				Scanner input=new Scanner(System.in);
				System.out.println("THIS PROGRAM SHOWS THE SIN AND COS OF ALL DEGREES 0-360 USING INCREMENTS OF 10");
				
				mclass a = new mclass();
				
				//printing answer
				for (deg=0;deg <= 360; deg+=10) {
				System.out.println(deg+"		");
				System.out.print("		"+(double)((int)(a.set_sin(deg)*100)));
				System.out.print("		"+(double)((int)(a.set_cos(deg)*100)));
				System.out.print("		"+(double)((int)(a.set_tan(deg)*100)));
				}
	}

}
