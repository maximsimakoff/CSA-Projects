import java.util.*;

public class sum_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num = 1;
		double den = 3;
		double sum = 0;
		
		for (int i=1;i<=49;i++)
		{
			System.out.println(num + "/" +den);
			sum=sum+(num/den);
			num+=2;
			den+=2;
		}
		System.out.println(sum);
	}

}
