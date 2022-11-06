package greatest_common_denominator;

public class gcd {

	private int num1;
	private int num2;
	
	
	public gcd()
	{
		num1=0;
		num2=0;
	}
	public gcd(int num_1,int num_2)
	{
		num1=num_1;
		num2=num_2;
	}
	public void set_num1(int num_1)
	{
		num1=num_1;
	}
	public void set_num2(int num_2)
	{
		num2=num_2;
	}
	public int get_ans()
	{
		int GCD=1;
		
		for(int i=1; i<=num1 && i<=num2; i++)
		{
			if(num1%i==0 && num2%i==0)
				GCD=i;
		}
		return GCD;
		
	}
	
}
