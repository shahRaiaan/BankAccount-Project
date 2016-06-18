import java.io.Console;
import java.util.List;
import java.util.Scanner;

public class main {
	private static void displayMenu() {

		System.out.println("Enter option number here : ");
		System.out.println("1 to create accout: ");
		System.out.println("2 to list all acount : ");
		System.out.println("3 to list only checking account : ");
		System.out.println("4 to list only saving account : ");
		System.out.println("5 to deposit : ");
		System.out.println("6 to withdraw : ");
		System.out.println("7 to apply Interest Rate : ");
		System.out.println("8 to set Interest Rate : ");
	}

	public static void main(String[] args) {

		Bank wellsfargo = Bank.getInstance();
		displayMenu();
		Scanner scanIn = new Scanner(System.in);
		String input = "";

		while (true) {

			input = scanIn.nextLine();

			if (input.compareToIgnoreCase("exit") == 0) {
				break;
			} else if (input.compareToIgnoreCase("1") == 0) {
				System.out.println("Enter Check to create checking Account or saving to create Savings Account");
				input = scanIn.nextLine();
				System.out.println("Enter Name");
				String name = scanIn.nextLine();
				System.out.println("Enter House No");
				String houseNo = scanIn.nextLine();
				System.out.println("Enter age");
				int age = scanIn.nextInt();
				System.out.println("Enter Road No");
				int roadNo = scanIn.nextInt();
				System.out.println("Enter Zipcode");
				int zipcode = scanIn.nextInt();

				if (input.compareToIgnoreCase("check") == 0) {
					wellsfargo.createAccount(name, age, roadNo, houseNo, zipcode, 0);
				} else if (input.compareToIgnoreCase("saving") == 0) {
					wellsfargo.createAccount(name, age, roadNo, houseNo, zipcode, 1);
				} else {
					System.out.println("Invalid option in create account");
				}
			} else if (input.compareToIgnoreCase("2") == 0) {
				List<Account> myList = wellsfargo.getAllAccounts();
				for (int i = 0; i < myList.size(); i++) {
					System.out.println(myList.get(i).toString());
					System.out.println(myList.get(i).getAddress().toString());
				}
			} else if (input.compareToIgnoreCase("3") == 0) {
				List<Account> myList = wellsfargo.getAllCheckingsAccount();
				for (int i = 0; i < myList.size(); i++) {
					System.out.println(myList.get(i).toString());
					System.out.println(myList.get(i).getAddress().toString());

				}

			} else if (input.compareToIgnoreCase("4") == 0) {
				List<Account> myList = wellsfargo.getAllSavingssAccount();
				for (int i = 0; i < myList.size(); i++) {
					System.out.println(myList.get(i).toString());
					System.out.println(myList.get(i).getAddress().toString());

				}
			} else if (input.compareToIgnoreCase("5") == 0) {
				System.out.println("Enter Account ID");
				int acctID = Integer.parseInt(scanIn.nextLine());
				Account temp = wellsfargo.getAccountByID(acctID);

				if (temp == null) {
					System.out.println("Could not find account with Id " + acctID);
				} else {
					System.out.println("Enter Deposit Amount");
					double depAmt = Double.parseDouble(scanIn.nextLine());
					temp.deposit(depAmt);
					System.out.println("Your updated current balance is " + temp.checkBalance());
				}
			} else if (input.compareToIgnoreCase("6") == 0) {
				System.out.println("Enter Account ID");
				int acctID = Integer.parseInt(scanIn.nextLine());
				Account temp = wellsfargo.getAccountByID(acctID);

				if (temp == null) {
					System.out.println("Could not find account with Id " + acctID);
				} else {
					System.out.println("Enter Withdrawal Amount");
					double withdrawAmt = Double.parseDouble(scanIn.nextLine());
					temp.withdraw(withdrawAmt);
					System.out.println("Your updated current balance is " + temp.checkBalance());
				}
			} else if (input.compareToIgnoreCase("7") == 0) {
				List<Account> savingAccountList = wellsfargo.getAllSavingssAccount();
				for (int i = 0; i < savingAccountList.size(); i++) {
					((Savings) savingAccountList.get(i)).applyInterest();
				}

			} else if (input.compareToIgnoreCase("8") == 0) {
				System.out.println("Enter BronzeRate");
				double bronzeRate = Double.parseDouble(scanIn.nextLine());
				System.out.println("Enter SilverRate");
				double silverRate = Double.parseDouble(scanIn.nextLine());
				System.out.println("Enter GoldRate");
				double goldRate = Double.parseDouble(scanIn.nextLine());

				wellsfargo.setInterestRate(bronzeRate, silverRate, goldRate);
			}

			else {
				displayMenu();
			}
		
		}
		scanIn.close();
	}
}