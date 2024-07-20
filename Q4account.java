package Task6;

public class Q4account {

	static double balance;
	
	//constructor without arguments
	public Q4account() {
		this.balance = 0;
	}
	//constructor with arguments
	public Q4account(double bal) {
		this.balance =bal;
	}
	// account balance checking
	public void balanceCheck() {
		System.out.println("The Balance is: "+ balance);
	}
	// Deposit amount to the acoount
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("The deposit Amount:"+ amount);
		System.out.println("After deposite balance: "+balance);
	}
	// Withdraw amount form account
	public void withdraw(double amount) {
		balance = balance - amount;
		//balance = balance - amount2;
		System.out.println("The withdraw amount: "+ amount);
		System.out.println("The balance After withdraw: "+ balance);
	}
	
	public static void main(String[] args) {
		// 1st account
		Q4account acc = new Q4account(10000);
		System.out.println("1st - Account details");
		acc.balanceCheck();
		acc.deposit(5000);
		//withdraw
		System.out.println("====Withdraw====");
		acc.withdraw(3000);
		acc.balanceCheck();
		
		//2nd account
		Q4account acc2 = new Q4account(50000);
		System.out.println("\n----2nd - Account details----");
		acc2.balanceCheck();
		acc2.deposit(25000);
		//withdraw
		System.out.println("====Withdraw====");
		acc2.withdraw(5000);
		acc2.balanceCheck();
				
		
	}

}
