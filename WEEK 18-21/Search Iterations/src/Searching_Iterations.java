import java.util.*;

public class Searching_Iterations {

	public static void main(String[] args) {
		int[] array1 = new int[100];
		for (int i = 0; i < array1.length; i++) {
			array1[i] = (int) (Math.random() * 10);

		}

		for (int p = 0; p < 20; p++) {
			for (int j = 0; j < array1.length - 1; j++) {
				if (array1[j] <= array1[j + 1]) {
				} else {
					int temp1 = array1[j];
					int temp2 = array1[j + 1];
					array1[j] = temp2;
					array1[j + 1] = temp1;
				}
			}

		}

		for (int i = 0; i <= array1.length - 1; i++) {
			System.out.println(array1[i]);
		}

	}

}
