public class Checking extends Account{
   private double overdraftlim;
   public void withdraw(double amount) {
       if ((checkBalance() - amount) > (-1 * overdraftlim)) {
            super.withdraw(amount);
       }
   }
   public Checking(int an, double bal, double rt, long dt, double ovlim) {
       super(an, bal, rt, dt);
       overdraftlim = ovlim;
   }
   public Checking(double ovlim) {
       overdraftlim = ovlim;
   }
   public Checking() {
       super();
       overdraftlim = 500;
   }
   public String toString() {
       return (super.toString() + "Overdraft Limit: " + overdraftlim);
   }
}