public class Savings extends Account {
	// private double withdrawlim;
	public void withdraw(double amount) {
		if (amount <= checkBalance()) {
			super.withdraw(amount);
		}
	}

	public Savings(int an, double bal, double rt, long dt) {
		super(an, bal, rt, dt);
	}

	public Savings() {
		super();
	}
}