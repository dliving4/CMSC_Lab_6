/**
 * 
 * @author Dylan Livingstone
 *
 */
public class CheckingAccount extends BankAccount {
	
	private double FEE = 0.15;
	private String accountNumber;

	/**
	 * Basic constructor
	 * @param String Name 
	 * @param Double Balance
	 */
	public CheckingAccount(String name, double balance) {	
		super(name, balance);
		this.accountNumber = this.getAccountNumber() + "-10";
		this.setAccountNumber(this.accountNumber);
	}

	/**
	 * Withdraw balance
	 * @param Double amount
	 */
	public boolean withdraw(double amount) {

		if (amount > this.getBalance()) { return false; }
		if (amount + (this.FEE) > this.getBalance()) { return false; }

		boolean result = super.withdraw(amount + (this.FEE));

		return result;
	}
}
