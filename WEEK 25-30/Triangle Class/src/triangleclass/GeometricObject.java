package triangleclass;

import java.util.ArrayList;

public class GeometricObject {
	protected ArrayList<Double> sides = new ArrayList<Double>();
	protected double area;

	public void printSides() {
		for (Double side : this.sides) {
			System.out.println(side + " ");
		}
	}

}
