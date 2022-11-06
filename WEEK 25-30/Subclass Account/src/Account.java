import java.util.Scanner;

public class Account {
	private int accountnumber;
	private double balance;
	private double annualinterestrt;
	private long datecreated;

	public Account(int an, double bal, double rt, long dt) {
		accountnumber = an;
		balance = bal;
		annualinterestrt = rt;
		datecreated = dt;
	}

	public Account() {
		accountnumber = 1;
		balance = 2000;
		annualinterestrt = 0.05;
		datecreated = 1012001;
	}

	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdraw(double amount) {
		this.balance -= amount;
	}

	public double checkBalance() {
		return balance;
	}

	public int checkAccnum() {
		return accountnumber;
	}

	public long checkDate() {
		return datecreated;
	}

	public void timewarp(int years) {
		for (int i = 0; i <= years; i++) {
			balance = balance + (balance * annualinterestrt);
		}
	}

	public String toString() {
		return (this.getClass().getSimpleName() + "\nAcc Number: " + accountnumber + "\nBalance: " + balance
				+ "\nAnnual Interest Rate: " + annualinterestrt + "\nDate Created: " + datecreated + "\n");
	}

	public static void main(String[] args) throws Exception {
		Account acc = new Account();
		System.out.println(acc);
		Savings sav = new Savings(2, 10000, 0.06, 9012002);
		System.out.println(sav);
		Checking chck = new Checking(3, 700, 0.01, 8112003, 200);
		System.out.println(chck);
		Scanner input = new Scanner(System.in);
		int choice = 1;
		while (choice == 1 || choice == 2) {
			System.out.println("Press 1 to modify savings, 2 to modify checking, 0 to exit");
			choice = input.nextInt();
			if (choice == 1) {
				System.out.println(sav.checkBalance());
				System.out.println("Press 1 to deposit, 2 to withdraw");
				choice = input.nextInt();
				if (choice == 1) {
					System.out.println("Enter amount to deposit");
					double amount = input.nextDouble();
					sav.deposit(amount);
					System.out.println(sav.checkBalance());
					continue;
				} else if (choice == 2) {
					System.out.println("Enter amount to withdraw");
					double amount = input.nextDouble();
					sav.withdraw(amount);
					System.out.println(sav.checkBalance());
					continue;
				}
			}
			if (choice == 2) {
				System.out.println(chck.checkBalance());
				System.out.println("Press 1 to deposit, 2 to withdraw");
				choice = input.nextInt();
				if (choice == 1) {
					System.out.println("Enter amount to deposit");
					double amount = input.nextDouble();
					chck.deposit(amount);
					System.out.println(chck.checkBalance());
					continue;
				} else if (choice == 2) {
					System.out.println("Enter amount to withdraw");
					double amount = input.nextDouble();
					chck.withdraw(amount);
					System.out.println(chck.checkBalance());
					continue;
				}
			}
		}
		input.close();
	}
}