package approx_root;
public class AprxSqrt {
	//private variables
	private double a;
	private double lastGuess;
	private double nextGuess;
	
	public AprxSqrt() {
		a=0;
	}
	
	public AprxSqrt(double number) {
		a=number;
	}
	
	public void set_num(double number) {
		a=number;
	}
	
	public double get_ans()
	{
		double lastGuess=1, nextGuess=(lastGuess+a/lastGuess)/2;
	if(a!=0) 
	{
			while(nextGuess-Math.sqrt(a)>0.001)
			{
				lastGuess=nextGuess;
				nextGuess=(lastGuess+a/lastGuess)/2.0;
			}
			lastGuess=nextGuess;
			nextGuess=(lastGuess+a/lastGuess)/2;
			return nextGuess;
	}
	else 
	{
	return a;	
	}
	
	}
	
	
}
