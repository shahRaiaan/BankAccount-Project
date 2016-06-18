
public class Account {

	protected Address addr = new Address();
	protected int age;
	protected double balance;
	protected int ID;
	protected BankLocation location;
	// data members
	protected String name;

	// constructor
	public Account() {

	}

	// checks the current balance amount
	public double checkBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}

	public Address getAddress() {
		return addr;
	}

	// return age
	public int getAge() {
		return age;
	}

	public BankLocation getBankLocation() {
		return location;
	}

	// return ID
	public int getID() {
		return ID;
	}

	// return name
	public String getName() {
		return name;
	}

	// set value for age
	public void setAge(int age) {
		this.age = age;
	}

	public void setBankLocation(BankLocation bankLocation) {
		this.location = bankLocation;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	// adds deposited amount to balance

	// set value for name
	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return " Name : " + this.name + ", Age :" + this.age + ", Balance : " + this.balance + ", ID :" + this.ID;
	}

	// adjusts balance after withdrawal
	public void withdraw(double amount) {
		balance = balance - amount;
	}
}// end of Account Class
