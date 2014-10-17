import java.util.InputMismatchException;
import java.util.Scanner;

public class mainApp {
	
	static String action;
	static String accountType;
	static int amt;
	static Scanner sc = new Scanner(System.in);
	
	/*public static void getInfo(){

		
		
		System.out.println("Checking or saving? (c/s):");
		//accountType = sc.findInLine("cCsS");

		System.out.println("Amount? :");
		amt = sc.nextInt();			
	}*/

    public static void main(String []args) {
    	
    	User u = new User();
    	u.entername("Amruta","Kulkarni");
    	u.printUsername();
    	u.checkAccount.printAccountBalance();
    	u.saveAccount.printAccountBalance();
    	
    	String cont = "y";

    	while(!cont.equalsIgnoreCase("n")){
    		
    		try{
    			System.out.println("Withdraw or deposit? (w/d):");    			 
    			 action = sc.next("[wWdD]");
    			 
    			
				
    		}catch(InputMismatchException e){
    				sc.next();
    				System.out.println("Invalid Input ! Please try again!");    			
    				continue;
    		}
    		
    		try{
    			 System.out.println("Checking or saving? (c/s):");    			 
     			 accountType = sc.next("[cCsS]");
				
    		}catch(InputMismatchException e){
    			sc.next();
    			System.out.println("Invalid Input ! Please try again");    			
    			continue;
    		}
    		
    		
				if (action.equals("w") && accountType.equals("c")){
					u.checkAccount.withdrawmoney(amt);
				}
				else if (action.equals("w") && accountType.equals("s")){
					u.saveAccount.withdrawmoney(amt);
				}
				else if (action.equals("d") && accountType.equals("c")){
					u.checkAccount.depositmoney(amt);
				}
				else if (action.equals("d") && accountType.equals("s")){
					u.saveAccount.depositmoney(amt);
				};
				
			try{
					System.out.println("Continue? (y/n): ");
					cont = sc.next("[yYnN]");
			}catch(InputMismatchException e){
	    			sc.next();
	    			System.out.println("Invalid Input ! Please try again:");    			
	    			continue;
	    	}
    		
		
    	} //end while
    	
    	
    	u.checkAccount.closingTransactions();
    	u.saveAccount.closingTransactions();
    	
    	u.checkAccount.printAccountBalance();
    	u.saveAccount.printAccountBalance();
    	
    	sc.close();
    	
    }
}