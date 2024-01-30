import java.util.Scanner;

public class ATM {
	//connecting ATM Class to BankAccount class
	private BankAccount bankAccount;
	Scanner scanner = new Scanner(System.in);
	
	public ATM(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}
	
	public void start() {
		int choice;
		do {
			 System.out.println("Welcome to ATM Menu:");
		        System.out.println("1. Withdraw");
		        System.out.println("2. Deposit");
		        System.out.println("3. Check Balance");
		        System.out.println("4. Exit");
		        System.out.println("Enter choice: ");
			choice = scanner.nextInt();
			if(choice == 1) {
				withdraw();
			}else if(choice == 2){
				deposit();
			}else if(choice == 3) {
				checkBalance();
			}else if(choice == 4) {
				System.out.println("Goodbye!!!");
			}
		}while(choice != 4);
	}

	private void checkBalance() {
		System.out.println("Current Balance: " + bankAccount.getBalance());
		
	}

	private void deposit() {
		 System.out.print("Enter amount to deposit: ");
	        int amount = scanner.nextInt();
	        if (amount > 0) {
	            bankAccount.deposit(amount);
	            System.out.println("You now have: " + bankAccount.getBalance());
	        } else {
	            System.err.println("Invalid amount!");
	        }
		
	}

	private void withdraw() {
		System.out.println("How much do you want to withdraw: ");
		int amount = scanner.nextInt();
		if(amount > 0) {
			bankAccount.withdraw(amount);
			 System.out.println("You now have: " + bankAccount.getBalance());
		}else {
			System.err.println("Invalid amount");
		}
		
	}

}
