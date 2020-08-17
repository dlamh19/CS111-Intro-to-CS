public class BankAccount
{

	private String name;

	private double balance;

	private double accountNum;

	private double withdraw;

	private double deposit;

	//default contructor
	public BankAccount ()
	{
		name = "";
		balance = accountNum = withdraw = deposit = 0;
	}

	public BankAccount(String name, double accountNum, double withdraw, double deposit, double initialBalance)
	{
		this.name = name;
		this.accountNum = accountNum;
		this.withdraw = withdraw;
		this.deposit = deposit;
		this.balance = initialBalance;
	}

	public boolean deposit(double money)
	{
		balance +=money;
		return true;
	}

	public void withdraw(double money)
	{
		if(balance < 0 || money > balance)
			System.out.println("Insuffiecient Funds");
		else
			balance -=money;
	}

	public boolean transfer(double transfer, BankAccount from, BankAccount to)
	{
		if(from.withdraw(transfer))
		{
			to.deposit(transfer);
			return true
		}
	return false;
	}

	public getBalance()
	{
		return balance;
	}

	public getName()
	{
		return name;
	}

	public getAccountNum()
	{
		return accountNum;
	}

	public static void main(String[] args)
	{















	}


}