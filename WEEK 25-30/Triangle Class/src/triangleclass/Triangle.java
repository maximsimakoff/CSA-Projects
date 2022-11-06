package triangleclass;

import java.util.ArrayList;

public class Triangle extends GeometricObject {
	public Triangle() {
		this.sides.add(1.0);
		this.sides.add(1.0);
		this.sides.add(1.0);
	}

	public Triangle(double side1, double side2, double side3) {
		this.sides.add(side1);
		this.sides.add(side2);
		this.sides.add(side3);
	}

	public ArrayList<Double> getSides() {
		return this.sides;
	}

	public double getArea() {
		double semiperimeter = (this.sides.get(0) + this.sides.get(1) + this.sides.get(2)) / 2.0;
		double area = Math.sqrt(semiperimeter * (semiperimeter - this.sides.get(0))
				* (semiperimeter - this.sides.get(1)) * (semiperimeter - this.sides.get(2)));
		return area;
	}

	public double getPerimeter() {
		return this.sides.get(0) + this.sides.get(1) + this.sides.get(2);
	}

	public String toString() {
		String description = "The sides of the triangle are " + this.sides.toString() + "  and the area is "
				+ this.getArea() + " " + " and the perimeter is " + this.getPerimeter();
		return description;
	}
}