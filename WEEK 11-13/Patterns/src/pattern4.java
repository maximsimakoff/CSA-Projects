
public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 0;
		int j = 0;
		int i = 0;

		for (i = 1; i <= 6; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (k = 7 - i; k > 0; k--) {
				System.out.print(k);
			}
			System.out.println();
		}
	}

}
