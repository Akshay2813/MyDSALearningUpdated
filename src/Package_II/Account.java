package Package_II;

public class Account {
	
	private double balance;
	Account(double balance)
	{
		
		System.out.println("Constructor called automatically");
		this.balance=balance;
	}
	
	public double getBalance()
	{
		return this.balance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account a = new Account(500);
		double balance = a.getBalance();
		
		System.out.println(balance);
		
		
		
		

	}

}
