
public class Checking extends BankAccount implements Transactions{
	
	int fee = 1;
	
	public void depositmoney(int amount){
		balance += amount;
	}

	public void withdrawmoney(int amount){
		balance -= amount;
	}
	
	public void closingTransactions(){
		balance -= fee;
	}

	public void printAccountBalance(){
		System.out.println("Checking Balance: " + balance);
	}

}