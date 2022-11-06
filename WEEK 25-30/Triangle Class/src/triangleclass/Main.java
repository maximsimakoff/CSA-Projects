package triangleclass;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three sides of a triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		if((side1 + side2) < side3) {
			System.out.println("Invalid triangle");
			System.exit(-1);
		}
		Triangle tri = new Triangle(side1, side2, side3);
		
		if (tri.getArea()==0) {
			System.out.println("Not a triangle");
			
		} else {
	
			System.out.println(tri.toString());
		}		
	}
}
