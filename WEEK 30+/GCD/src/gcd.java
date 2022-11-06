public class gcd {
	public static int gcd(int m, int n) {
		int gcd;
		if ((m % n) == 0) {
			gcd = n;
		} else {
			gcd = gcd(n, m % n);
		}
		return gcd;
	}

	public static void main(String[] args) {
		System.out.println("GCD of 24 + 16 = " + gcd(24, 16));
		System.out.println("GCD of 255 + 25 = " + gcd(255, 25));
	}
}