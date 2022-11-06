package math_class;

public class mclass {

	private double Sinx;
	private double Cosx;
	private double Tanx;
	private double deg;
	
	public mclass() {
		Sinx=0;
		Cosx=0;
		Tanx=0;
		deg = 0;
	}
	public double set_sin(double x)
	{
		Sinx = Math.sin(Math.toRadians(x));
		return Sinx;
	}
	public double set_cos(double x)
	{
		Cosx = Math.cos(Math.toRadians(x));
		return Cosx;
	}
	public double set_tan(double x)
	{
		Tanx = Math.tan(Math.toRadians(x));
		return Tanx;
	}
	
}
