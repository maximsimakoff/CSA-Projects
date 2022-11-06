package reverse_int;

//start of class
public class converter {

	//declare private variables
	private int number;
	private int back;
	private int remainder;
	
	//making public converter
	public converter()
	{
		number=0;
		back=0;
	}
	
	public void set_num(int num) {
		number=num;
	}
	
	//mathematics
	public int get_order() {
	for(;number != 0;) 
	{
	remainder=number%10;
	back=back*10+remainder;
	number=number/10;
	}	
	//returning the variable
	return back;
	}
	
	}
//end of class
