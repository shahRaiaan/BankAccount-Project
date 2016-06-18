import java.util.ArrayList;
import java.util.List;

public class Bank {
	private static Bank instance;

	public static Bank getInstance() {
		if (instance == null) {
			instance = new Bank();
		}
		return instance;
	}

	private List<Account> accountList;
	private int id = 0;
	private InterestRate interest;

	private int registrationNo;

	// constructor
	private Bank() {
		accountList = new ArrayList<Account>();
		interest = new InterestRate();

	}

	// method to use account
	public Account createAccount(String name, int age, int roadNo, String houseNo, int zipcode, int typeOfAccount) {

		Account newAccount;
		if (typeOfAccount == 0) {
			newAccount = new Checking();
		} else {
			newAccount = new Savings();
			((Savings) newAccount).setRate(interest);
		}
		newAccount.setName(name);
		newAccount.setAge(age);
		newAccount.getAddress().setRoadNo(roadNo);
		newAccount.getAddress().setHouseNo(houseNo);
		newAccount.getAddress().setZipcode(zipcode);
		newAccount.setID(id);
		id++;
		accountList.add(newAccount);

		return newAccount;

	}

	// method to return the account with the given ID
	public Account getAccountByID(int ID) {

		Account x = null;
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.get(i).getID() == ID) {
				x = accountList.get(i);
			}
		}
		return x;
	}

	// method to return list of all accounts
	public List<Account> getAllAccounts() {
		return accountList;

	}

	// method to return list of all checkings accounts
	public List<Account> getAllCheckingsAccount() {

		List<Account> checkings = new ArrayList<Account>();
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.get(i) instanceof Checking) {

				checkings.add(accountList.get(i));
			}
		}

		return checkings;
	}

	// method to return list of all savings account
	public List<Account> getAllSavingssAccount() {

		List<Account> savings = new ArrayList<Account>();
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.get(i) instanceof Savings) {

				savings.add(accountList.get(i));
			}
		}
		return savings;
	}

	// method to return registrationNo
	public int getRegistrationNo() {
		return registrationNo;
	}

	public void setInterestRate(double bronzeRate, double silverRate, double goldRate) {
		this.interest.setBronzeInterestRate(bronzeRate);
		this.interest.setSilverInterestRate(silverRate);
		this.interest.setGoldInterestRate(goldRate);
	}
}// end of Bank Class
