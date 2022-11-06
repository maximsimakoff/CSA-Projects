import java.util.*;

public class pyramid {

	private int lines;

	public pyramid(int lines) {
		this.lines = lines;
	}

	public void printPyramid() {
		int tmp1 = 1;
		int tmp2 = 1;
		int tmp3 = 1;
		System.out.println("                             1");
		for (int i = 1; i <= lines; i++) {
			tmp1 = 1;
			tmp2 = 1;
			if (i == 1) {
				System.out.print("                         ");
			} else if (i == 2) {
				System.out.print("                     ");
			} else if (i == 3) {
				System.out.print("                 ");
			} else if (i == 4) {
				System.out.print("             ");
			} else if (i == 5) {
				System.out.print("         ");
			} else if (i == 6) {
				System.out.print("     ");
			} else {
				System.out.print(" ");
			}

			System.out.print(tmp1);
			while (tmp2 <= i) {
				if (tmp1 / 10 == 0) {
					System.out.print("   ");
				} else if (tmp1 / 10 >= 1 && tmp1 / 10 < 10) {
					System.out.print("  ");
				} else if (tmp1 / 10 > 10) {
					System.out.print(" ");
				}
				tmp1 *= 2;
				System.out.print(tmp1);
				tmp2++;
				tmp3++;
			}
			while (tmp3 > 1) {
				if (tmp1 / 10 == 0) {
					System.out.print("   ");
				} else if (tmp1 / 10 >= 1 && tmp1 / 10 < 10) {
					System.out.print("  ");
				} else if (tmp1 / 10 > 10) {
					System.out.print(" ");
				}
				tmp1 /= 2;
				System.out.print(tmp1);
				tmp3--;
			}
			System.out.println();
		}
	}

}
