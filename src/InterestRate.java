
public class InterestRate {
	// data members
	double bronzeInterestRate = .10;
	double goldInterestRate = .12;
	double silverInterestRate = .11;

	public double getBronzeInterestRate() {
		return bronzeInterestRate;
	}

	public double getGoldInterestRate() {
		return goldInterestRate;
	}

	public double getInterestRate(SavingsAccountState state) {
		if (state instanceof SilverState) {
			return silverInterestRate;
		} else if (state instanceof GoldState) {
			return goldInterestRate;
		} else {
			return bronzeInterestRate;
		}
	}

	public double getSilverInterestRate() {
		return silverInterestRate;
	}

	public void setBronzeInterestRate(double bronzeInterestRate) {
		this.bronzeInterestRate = bronzeInterestRate;
	}

	public void setGoldInterestRate(double goldInterestRate) {
		this.goldInterestRate = goldInterestRate;
	}

	public void setSilverInterestRate(double silverInterestRate) {
		this.silverInterestRate = silverInterestRate;
	}
}
