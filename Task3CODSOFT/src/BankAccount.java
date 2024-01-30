
public class BankAccount {
	int balance;
	public BankAccount(int balance) {
		this.balance = balance;
	}
	//method to get balance amount implemented
	public double getBalance() {
		return balance;
	}
	
	//method to deposit money implemented
	public void deposit(int amount) {
		balance = balance + amount;
		System.out.println("You deposited: " + amount);
	}
	
	
	//method to withdraw money implemented
	public void withdraw(int amount) {
		if(amount <= balance) {
			balance = balance - amount;
			System.out.println("You withdrew: " + amount);
		}else {
			System.err.println("Insuffient funds");
		}
	}
	
}
