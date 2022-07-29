/**
 * 
 * @author Dylan Livingstone
 *
 */
public class SavingsAccount extends BankAccount {
	
	private double rate = 2.5;
	private int savingsNumber = 0;
	private String accountNumber;

	/**
	 * Basic constructor
	 * @param String name
	 * @param double balance
	 */
	public SavingsAccount(String name, double balance) {
		super(name, balance);
		this.accountNumber = super.getAccountNumber();
		this.setAccountNumber(this.accountNumber);
	}

	/**
	 * Copy Constructor
	 * @param account
	 * @param balance
	 */
	public SavingsAccount(BankAccount account, double balance) {
		super(account, balance);
		this.savingsNumber++;
		this.accountNumber = super.getAccountNumber();
		this.setAccountNumber(this.accountNumber);
	}


	/**
	 * Calculates interest
	 */
	public void postInterest() {
	    super.deposit(super.getBalance() * (rate / (100 * 12)));
	  }

	/**
	 * Returns the account number
	 */
	public String getAccountNumber()
	{
		return this.accountNumber + "-" + savingsNumber;
	}
}
