
public class Savings extends Account {

	private InterestRate rate;
	private SavingsAccountState state;

	public Savings() {
		this.state = new BronzeState();

	}

	public void applyInterest() {
		this.balance += this.balance * rate.getInterestRate(state);
	}

	private void changeState() {
		if (balance > 100 && balance < 1000) {
			state = new SilverState();
		} else if (balance > 1000) {
			state = new GoldState();
		}
	}

	public void deposit(double amount) {
		balance = balance + amount;
		changeState();

	}

	public InterestRate getRate() {
		return rate;
	}

	public SavingsAccountState getState() {
		return state;
	}

	public void setRate(InterestRate rate) {
		this.rate = rate;
	}

	public String toString() {
		return super.toString() + " " + state.toString();
	}

	// adjusts balance after withdrawal
	public void withdraw(double amount) {
		balance = balance - amount;
		changeState();

	}
}// end of Savings Class
