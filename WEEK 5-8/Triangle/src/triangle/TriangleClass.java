package triangle;

public class TriangleClass {
//declare private variables
private int side1;
private int side2;
private int side3;
//public variables
public TriangleClass() {
	side1=0;
	side2=0;
	side3=0;
}
//public definition
public TriangleClass(int first, int second, int third) {
	side1= first;
	side2= second;
	side3= third;
}
//declaring public first
public void set1(int first) {
	side1=first;
}
//declaring public second
public void set2(int second) {
	side2=second;
}
//declaring public third
public void set3(int third) {
	side3=third;
}
//solving triangle and printing
public String solve() {
	String answer="";
	if (side1+side2>side3&&side2+side3>side1&&side2+side3>side1) {
	answer = "Can edges "+side1+" ,"+side2+" ,"+side3+" form a triangle? True";}
	else {
		answer= "Can edges "+side1+" ,"+side2+" ,"+side3+" form a triangle? False";
	}
	return answer;
	}
//area calculation
public double area() {
	double z=(side1+side2+side3)/2.0;
	return Math.sqrt(z*(z-side1)*(z-side2)*(z-side3));
}
//area calculation end

}//end of class
