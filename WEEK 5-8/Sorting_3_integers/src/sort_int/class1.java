package sort_int;

public class class1 {

	private double number1;
	private double number2;
	private double number3;
	
	public class1() {
		number1=0.0;
		number2=0.0;
		number3=0.0;
	}
	public class1(double in_1, double in_2, double in_3) {
		number1=in_1;
		number2=in_2;
		number3=in_3;
	}
	public void set1(double in_1)
	{
	number1=in_1;
	}
	public void set2(double in_2)
	{
	number2=in_2;
	}
	public void set3(double in_3)
	{
	number3=in_3;
	}
	
	//solving the equation after statements declaration
	public void solve()
	{
		if (number1<number2&number2<number3)
			System.out.println("First: "+number1+" Second: "+number2+" Third: "+number3);
				else if (number1<number3&&number3<number2)
					System.out.println("First: "+number1+" Second: "+number3+" Third: "+number2);
					
				else if (number2<number1&&number1<number3)
					System.out.println("First: "+number2+" Second: "+number1+" Third: "+number3);
			
				else if (number2<number3&&number3<number1)
					System.out.println("First: "+number2+" Second: "+number3+" Third: "+number1);
		
				else if (number3<number1&&number1<number2)
					System.out.println("First: "+number3+" Second: "+number1+" Third: "+number2);
				
				else if (number3<number2&&number2<number1)
					System.out.println("First: "+number3+" Second: "+number2+" Third: "+number1);
	}
}
