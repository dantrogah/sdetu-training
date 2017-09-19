package oop;

public class Account {
	
	// instance variables
	private String accName;
	private String accNumber;
	private String ssn;
	
	//class variable 
	private static final String routineNumber = "2365123";
	
	//getters and setters
	public String getAccName() {
		return accName;
	}
	
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public String getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	

}
