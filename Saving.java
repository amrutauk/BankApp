
public class Saving extends BankAccount implements Transactions{
	
	double interest = 0.01;
	double simpleint = 0;
	
	public void depositmoney(int amount){
		balance += amount;
	}

	public void withdrawmoney(int amount){
		balance -= amount;
	}

	public void closingTransactions(){
		simpleint = balance * interest;
		balance += simpleint;
	}
	
	public void printAccountBalance(){
		System.out.println("Saving Balance: " + balance);
	}


}