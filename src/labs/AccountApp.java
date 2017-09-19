package labs;

public class AccountApp {

	public static void main(String[] args) {
		// instances of the Bank Account class
		
		BankAccount acct1 = new BankAccount("5421368", 1000.70);
		BankAccount acct2 = new BankAccount("1214512", 1500);
		BankAccount acct3 = new BankAccount("8651423", 1400.50);
		BankAccount acct4 = new BankAccount("3345781", 1300);
		
		acct1.setName("Tommy");
		acct1.printAccountDetails();
		
		//acct2.setName("Pearl");
		//acct2.printAccountDetails();
		
		acct1.deposit(500);
		acct1.deposit(2500.30);
		acct1.computeInterest();
		acct1.printAccountDetails();
		
		acct1.payBill(300);
		acct1.printAccountDetails();
		
		
		
	}
}


class BankAccount implements InterestRate {
	
	// Properties of bank account
	private static int ID = 100;
	private String accountNumber;
	private String name;
	private String SSN;
	private static final String routingNumber = "00012345";
	private double balance;
	
	// constructor
	public BankAccount(String SSN, double initialDeposit){
		
		this.SSN = SSN;
		ID++;
		
		if(initialDeposit < 1000){
			System.out.println("Sorry the initial deposit has to be ¢1000.00");
		}else{
			balance = initialDeposit;
			setAccountNumber();
		}

	}
	
	// set and get name
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	private void setAccountNumber(){
		int random = (int)( (Math.random() +1) * 100 );
		accountNumber = ID + "" + random + SSN.substring(0, 2);
		System.out.println("Your Account Number is " + accountNumber +
				", " + "Balance ¢" + balance); 
	}

	public void payBill(double amount){
		balance -= amount;
	}
	
	public void deposit(double amount){
		balance += amount;
	}
	
	public void printAccountDetails() {
		System.out.println( "BankAccount Detials [accountNumber=" + accountNumber + ", name=" + name + ", SSN=" + SSN + ", balance="
				+ balance + "]");
	}

	@Override
	public void computeInterest() {
		
		balance = balance * (1 + rate/100);
		
	}
	

	
}